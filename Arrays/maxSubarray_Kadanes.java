package com.company.Arrays;

public class maxSubarray_Kadanes {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int currentsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length;i++){
          currentsum = currentsum+arr[i];
          if(currentsum<0){
              currentsum = 0;
          }
          max = Math.max(currentsum,max);
        }
        System.out.println(max);
    }
}
