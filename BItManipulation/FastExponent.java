package com.company.BItManipulation;

public class FastExponent {
    public static int exponent(int a,int n) {
        int ans = 1;
        while (n>0) {
            if ((n & 1) != 0) {// Check if LSB is 1 or not
                ans = ans * a;
            }
            a = a * a;// square value of a(base) on every iteration
            n = n >> 1;// keep right shifting bits after work of each bit is done
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(exponent(2,5));
    }
}
