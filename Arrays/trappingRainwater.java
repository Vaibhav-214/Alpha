package com.company.Arrays;

public class trappingRainwater {
    public static int rainwaterstored(int [] arr){
        // Auxillary array for left max
        int [] leftmax = new int[arr.length];

//        int left = arr[0];
//        for(int i = 0; i< arr.length;i++){
//            if(arr[i]>left){
//                left = arr[i];
//                leftmax[i] = arr[i];
//            }else {
//                leftmax[i] = left;
//            }
//        }
        leftmax[0] = arr[0];
        for (int i = 1; i< arr.length; i++){
            leftmax[i] = Math.max(arr[i],leftmax[i-1] );
        }

        // Auxillary array for right max
        int [] rightmax = new int[arr.length];
//        int right = arr[arr.length-1];
//        for(int i = arr.length-1; i >= 0;i--){
//            if(arr[i]>right){
//                right = arr[i];
//                rightmax[i] = arr[i];
//            }else {
//                rightmax[i] = right;
//            }
//        }

        // better way to write a Auxillary array for right max
        rightmax[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2 ; i>=0; i-- ){
            rightmax[i] = Math.max(arr[i],rightmax[i+1]);
        }
        // total stored water
        int rainwater = 0;
        int waterlevel ;
        //loop
        for(int i=0 ; i< arr.length;i++){
            // waterlevel will be stored upto what height for each bar
            waterlevel = Math.min(leftmax[i],rightmax[i]);
            // actual rainwater stored at each bar is waterlevel - bar height
            rainwater += waterlevel - arr[i];
        }
        return rainwater;
    }
    public static void main(String[] args) {
        int [] arr = {4,2,0,6,3,2,5};
        System.out.println(rainwaterstored(arr));
    }
}
