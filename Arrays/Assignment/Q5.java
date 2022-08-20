package com.company.Arrays.Assignment;

public class Q5 {
    public static void triplets(int [] arr){
        System.out.print("[");
        for(int i= 0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                for (int k = j+1; k < arr.length; k++ ){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"] ");
                    }


                }
            }


        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        triplets(arr);
    }
}
