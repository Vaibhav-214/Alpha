package com.company.Arrays;

public class stocks {
    public static void buysell(int [] arr){
        int buy = arr[0];
        int maxprofit = 0;
        for(int i = 1; i<arr.length; i++){// start from one cause sell comes after buy only and first buy is possible on 0 only
            if(buy<arr[i]){// arr[i] here represents selling price on each day
                maxprofit= Math.max(maxprofit, arr[i]-buy);// if we sell on current day and profit is bigger than maxprofit then we should keep this profit
            }else {
                buy = arr[i];
            }
        }
        System.out.println("max possible profit is : "+ maxprofit);
    }


    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        buysell(arr);
    }
}
