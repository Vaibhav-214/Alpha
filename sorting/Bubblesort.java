package com.company.sorting;

public class Bubblesort {
    public static void bubble(int [] arr){
        for (int i = 0; i< arr.length-1; i++){
            boolean swap = false;
            for (int j = 0; j< arr.length-1-i; j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,42,-1,3,2,0,};
        bubble(arr);
        for (int e: arr){
            System.out.println(e);
        }
    }
}
