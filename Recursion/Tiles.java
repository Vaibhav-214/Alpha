package com.company.Recursion;

public class Tiles {
    public static int tilesproblem(int n) {
        if (n == 0 || n == 1) {// base condition
            return 1;
        }
        // kaam
        // vertical choice
        int fnm1 = tilesproblem(n-1);
        int fnm2 = tilesproblem(n-2);
        return fnm1+fnm2;
    }

    public static void main(String[] args) {
        System.out.println(tilesproblem(89));
        //Currently time complexity is too high, we will have optimized solution when we will do dynamic programming

    }
}
