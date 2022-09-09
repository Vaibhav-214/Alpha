package com.company.Recursion;

public class CheckSortedArray {
    public static boolean check(int [] arr,int n) {
        if (n == 1) {
            return arr[n] > arr[n-1];
        } else {
            if (arr[n] > arr[n-1]) {
                return check(arr,n-1);
            } else {
                return false;
            }
        }
    }
    public static boolean isSorted(int [] arr, int n) {
        if ( n == arr.length-1 ) {
            return true;
        }
        if (arr[n] > arr[n+1]) {
            return false;
        }
        return isSorted(arr,n+1);
    }

    public static void main(String[] args) {
        int []arr = {3,2,4,5,8};
        System.out.println(check(arr, arr.length-1));
        System.out.println(isSorted(arr,0));
    }
}
