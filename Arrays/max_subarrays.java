package com.company.Arrays;

public class max_subarrays {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length-1; i++){
            for(int j = i+1; j< arr.length; j++ ){
                sum = 0;
                System.out.print(" (");
                for(int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                if(sum<min){
                    min = sum;
                }
                if(sum>max){
                    max = sum;
                }
                System.out.print(")");
                System.out.println(" sum = "+sum);
            }
            System.out.println();
        }
        System.out.println(min);
        System.out.println(max);
    }
}
// kotlin code for making a property in a class of another class type

// here primaryOs and secondaryOs are properties of DualBoot and there type is OperatingSystem instead of Int,String, etc
/*
class OperatingSystem {
    var name: String = ""
}

class DualBoot {
    var primaryOs = OperatingSystem()
    var secondaryOs = OperatingSystem()
}
 */