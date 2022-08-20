package com.company.Arrays.Assignment;

public class Q1 {
    public static void isrepeated(int [] arr){
        for(int i= 0; i < arr.length;i++){
            for (int j = i+1; j < arr.length;j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]+" is repeated ");
                    return;
                }
            }
        }
        System.out.println("No number is repeated");
    }
    public static void main(String[] args) {
        //Given an integer array nums, return true if any value appears at least twice in the array,
        // and return false if every element is distinct.

        int [] nums = {1,2,3,1};
        isrepeated(nums);

    }
}
