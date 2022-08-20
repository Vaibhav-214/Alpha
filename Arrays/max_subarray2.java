package com.company.Arrays;

public class max_subarray2 {
    public static int prefix(int i,int []arr){
        if(i == 0 ){
            return arr[0];
        } else if( i== -1) {
            return 0;
        }else {
            return prefix(i-1,arr) + arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum = prefix(j, arr) - prefix(i - 1, arr);
                if ( sum >= max) {
                    max = sum;
                }
                if(sum <= min){
                    min = sum;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}



