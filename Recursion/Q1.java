package com.company.Recursion;

public class Q1 {
    public static int descending(int n) { //Print numbers from n to 1 using recursion(decreasing order)
        System.out.print(n+" ");
        if (n!=1) {
            return descending(n - 1);
        } else {
            return 0;
        }
    }
    public static void ascending(int n) {//Print numbers from 1 to n using recursion
        if (n == 1) {
            System.out.print (1+" ");
            return;
        } else {
            ascending(n-1);
            System.out.print(n+" ");
        }
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        descending(10);
        System.out.println();
        ascending(10);
        System.out.println();
        System.out.println(sum(10));
    }

}
