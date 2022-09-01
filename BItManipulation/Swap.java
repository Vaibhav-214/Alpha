package com.company.BItManipulation;

public class Swap {
    public static void main(String[] args) {
        //Program to swap two numbers by bit manipulation
        int x = 3;
        int y = 4;
        System.out.println("X before swap is "+x+ " and y before swap is "+ y);
        x = x^y;// ^ here is XOR operation
        y = x^y;
        x = x^y;
        System.out.println("X after swap is "+x+ " and y after swap is "+ y);

    }
}
