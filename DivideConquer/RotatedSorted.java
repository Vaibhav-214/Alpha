package com.company.DivideConquer;

public class RotatedSorted {
    public static int search(int [] arr, int target, int si, int ei) {
        if (si > ei) {
            return -1;// target does not exist in array
        }
        int mid = si + (ei - si)/2 ;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[si] <= arr[mid]) {//mid lies on line !
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid - 1);
            } else {
                return search(arr, target, mid + 1, ei);
            }
        }else {//(arr[mid] <= arr[ei])   mid lies on line 2
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid + 1, ei);
            } else {
                return  search(arr, target, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 4;
        int targetindex = search(arr, target, 0, arr.length - 1);
        System.out.println(targetindex);
    }
}
