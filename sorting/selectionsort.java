package com.company.sorting;

public class selectionsort {
    public static void selection(int [] arr){
        for (int i = 0; i<arr.length-1;i++){
            int minpos = i;
            for (int j= i+1; j< arr.length; j++){
                if (arr[j]<arr[minpos]){
                     minpos = j;
                }
            }
            // Difference between bubble sort and selection sort is that we dont swap everytime we swap only when we find final element
            // for that iteration
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr [] = {5,2,1,3,4};
        selection(arr);
        for (int e: arr){
            System.out.println(e);
        }
    }
}
