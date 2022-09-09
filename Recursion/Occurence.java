package com.company.Recursion;

public class Occurence {
    public static int first(int [] arr,int i,int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return first(arr,i+1,key);
    }
    public static int last(int []arr,int i, int key) {
        if (i < arr.length-1) {
            int isfound = last(arr, i+1, key);
            if(isfound != -1) {
                return isfound;
            }
        }
        if(arr[i] == key) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,3,4};
        first(arr,0,7);
        System.out.println(last(arr,0,4));
    }
}
