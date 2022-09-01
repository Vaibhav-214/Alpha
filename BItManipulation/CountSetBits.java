package com.company.BItManipulation;

public class CountSetBits {
    public static int countbits(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
             n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countbits(15));
    }
}
