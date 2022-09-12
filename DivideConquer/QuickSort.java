package com.company.DivideConquer;

public class QuickSort {
    public static void quickSort(int [] arr, int si, int ei) {
        if (si >= ei) {
            return; // base case
        }
        //last element
        int pidx = partition(arr,si,ei);// pivot index
        quickSort(arr, si,pidx - 1);//sorting left of pivot
        quickSort(arr,pidx + 1, ei);//sorting right of pivot
    }
    public static int partition(int [] arr, int si, int ei) {//most important
        int pivot = arr[ei];
        int iterator = si - 1;//to make place for elements smaller than pivot

        for (int i = si; i < ei; i++) {
            if (arr[i] <= pivot) {
                iterator++;
                int temp = arr[i];
                arr[i] = arr[iterator];
                arr[iterator] = temp;
            }
        }
        //code to put pivot at right place
        iterator++;
        int temp = pivot;
        arr[ei] = arr[iterator];
        arr[iterator] = temp;
        return iterator;//index of pivot
    }
    public static void print(int [] arr) {
        for (int e: arr) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        int [] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr,0, arr.length - 1);
        print(arr);
    }
}




