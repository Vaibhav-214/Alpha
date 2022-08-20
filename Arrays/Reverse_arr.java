package com.company.Arrays;

public class Reverse_arr {

    public static void reverse(int arr[]){
        int temp;
        //if (arr.length%2 == 0){
            for (int i=0; i<= arr.length/2 - 1; i++) {
                temp = arr[i];
                arr[i] = arr[arr.length-i-1];
                arr[arr.length-i-1] = temp;
            }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16,17};
        reverse(arr);
        for(int e: arr){
            System.out.println(e);
        }
    }
}
