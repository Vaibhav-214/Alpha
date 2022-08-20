package com.company.sorting;

public class countingsort {
    public static void counting(int [] arr){
        int [] count = new int [8];// we need to put elements from 0 to max num
        for( int i = 0; i < arr.length; i++){
                int k = arr[i];
                count[k] += 1;
        }
        int p = 0;
        for (int i = 0; i< count.length;i++){
            while (count[i] != 0){
                arr[p] = i;
                p++;
                count[i] -= 1;
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,1,3,2,4,3,7};
        counting(arr);
        for (int e: arr){
            System.out.println(e);
        }
    }
}
