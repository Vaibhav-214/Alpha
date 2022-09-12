package com.company.DivideConquer;

public class MergeSort_mysol {
    public static int [] mergeSort (int [] arr, int si, int ei) {
        if (si == ei) {
            int temp [] = {arr[si]};
            return temp;
        }
        int mid = si + (ei - si)/2;
        int [] leftsort = mergeSort(arr, si, mid);// left half
        int [] rightsort = mergeSort(arr, mid + 1, ei);// right half
        // merging left and right sort
        int [] temp = new int[leftsort.length + rightsort.length];
        int j = 0;
        int k = 0;


        for (int i = 0; i < temp.length; i++) {
            if (j < leftsort.length && k < rightsort.length) {
                if (leftsort[j] > rightsort[k]) {
                    temp[i] = rightsort[k];
                    k++;
                } else {
                    temp[i] = leftsort[j];
                    j++;
                }
            } else if (j >= leftsort.length) {
                temp[i] = rightsort[k];
                k++;
            }else {
                temp[i] = leftsort[j];
                j++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int [] arrtest = {6,3,9,5,2,8};
        arrtest = mergeSort(arrtest,0, arrtest.length - 1);
        for (int e: arrtest) {
            System.out.println(e);
        }
    }
}
