package com.company.Arrays;

public class forex_sell {
    // This is solutioin if we are trading in forex and we only have to take profit by selling, you can also include buying code
    // by making some changes to the this code

    public static void entryexit(int [] arr){
        int [] leftmax = new int[arr.length];
        leftmax[0] = arr[0];
        for (int i = 1; i< arr.length; i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1] );
        }

        int [] rightmax = new int[arr.length];
        rightmax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2 ; i>=0; i-- ){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        int rainwatermax = 0;
        int maxindex = 0;
        for(int i=0 ; i< arr.length;i++){
                if (rightmax[i] - arr[i] > rainwatermax) {
                    rainwatermax = rightmax[i] - arr[i];
                    maxindex = i;
                }
        }
        System.out.println("buy at: "+ arr[maxindex]+ " and sell at : "+ rightmax[maxindex]);
    }
    public static void main(String[] args) {
        int [] arr = {4,2,0,6,3,2,5};
        entryexit(arr);
    }
}
