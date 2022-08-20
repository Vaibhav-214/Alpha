package com.company.Arrays;

public class trappingrainwater_mysol {
    public static void main(String[] args) {
        // passed 152 test cases on gfg
        int[] arr = {4, 2, 0, 6, 3, 2, 5};
        int start = 0;
        int sum = 0;// make it long for gfg
        int max = 0;
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        int end = arr.length-1;
        for(int i =0; i<max; i++){
            if (arr[i] < arr[start]){
                sum = sum + arr[start]-arr[i];
            } else {
                start = i;
            }
        }
        for(int i = arr.length-1; i>max; i--){
            if (arr[i] < arr[end]){
                sum = sum + arr[end]-arr[i];
            } else {
                end = i;
            }
        }
        System.out.println("sum is : "+sum);
    }
}