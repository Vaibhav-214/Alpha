package com.company.Arrays;

public class stocks_mysol {
    public static void stock(int [] arr){
        int [] rightmax = new int[arr.length];
        rightmax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2 ; i>=0; i-- ){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        int buy = 0;
        int sell= 0;
        for(int i=0; i< arr.length;i++){
            if(rightmax[i]>arr[i] && rightmax[i]- arr[i] >sell - buy){
                buy = arr[i];
                sell = rightmax[i];
            }
        }
        System.out.println("buy at : " + buy +" sell at : "+sell + " and max profit is " + (sell-buy) );
    }
    public static void main(String[] args) {
        int [] arr = {4,2,0,6,3,2,5};
        stock(arr);
    }
}
