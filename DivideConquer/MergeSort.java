package com.company.DivideConquer;

public class MergeSort {
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(arr,si,mid);//sorting left half
        mergesort(arr,mid+1,ei);//sorting right half
        merge(arr,si,ei,mid);
    }
    public static void merge(int arr[],int si,int ei, int mid) {
        int temp [] = new int[ei - si + 1];
        int i = si;// index for first sorted part
        int j = mid + 1;// index for 2nd sorted part
        int k = 0; //index for temp

        while (i <= mid && j <= ei ) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of first sorted part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //for leftover elements of second sorted part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //copy temp to original array
        for (k = 0, i = si; k < temp.length ; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void print(int [] arr) {
        for (int e: arr) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int [] arrtest = {6,3,9,5,2,8};
        mergesort(arrtest,0, arrtest.length - 1);
        print(arrtest);
    }
}
