package com.company.BItManipulation;

public class PowerOf2 {
    public static boolean ispowerof2(int num){
        return (num & (num -1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(ispowerof2(8));
        System.out.println(ispowerof2(3));
    }
}
