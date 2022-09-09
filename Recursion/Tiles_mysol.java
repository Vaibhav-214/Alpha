package com.company.Recursion;

public class Tiles_mysol {//My sol involves use of permutation/combination
    public static int factorial(int n) {
        if(n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
    public static int noOfWays(int n,int h,int w) {
        if(n == 1) {
            return w+n+h;
        }
        if(n == 0) {
            return w+1;
        }
        w = w + factorial(n+h)/(factorial(n)*factorial(h));
        return noOfWays(n-2,h+1,w);
    }

    public static void main(String[] args) {
        //Currently time complexity is too high, we will have optimized solution when we will do dynamic programming

        System.out.println(noOfWays(10,0,0));
        System.out.println(noOfWays(5,0,0));
    }
}
