package com.company.Arrays;
import java.sql.SQLOutput;
import java.util.*;
public class Binary {
    public static int binary_search(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        int mid = end - (end -start)/2;

        while(start<=end){
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid+1;
                mid = end - (end - start)/2;
            } else {
                end = mid - 1;
                mid = end - (end -start)/2;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        System.out.println("Enter the number you want the index for ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println("The index is:");
        System.out.println(binary_search(arr,key));
    }
}
