package com.company.Recursion;

public class Exponent {
    public static int ans(int a,int n, int ans) {//Bit manipulation method
        if (n==0) {
            return ans;
        }
        int sol = ans ;
        if ((n & 1) != 0) {
             sol = ans * a;
        }
        return ans(a*a,(n>>1),sol);
    }
    public static int pow(int base,int power) {//Normie method
        if (power == 1) {
            return base;
        }
        return base * pow(base,power-1);
    }
    public static int optimized(int base,int power) {//
        if (power == 1) {
            return base;
        }
        int halfpower = optimized(base,power/2);
        if (power%2 == 0) {//power is even
            return halfpower*halfpower;
        } else {//power is odd
            return optimized(base,1)*halfpower*halfpower;
        }
    }

    public static void main(String[] args) {
        System.out.println(ans(2,10,1));
        System.out.println(optimized(2,10));
        System.out.println(pow(2,10));
    }
}
