package com.company.BItManipulation;

public class OddorEven {
    public static void oddeven(int num){
        int bitmask = 1;
        if ((num & bitmask) == 1 ) {// here num & bitmask should be in paranthesis
            System.out.println("Odd number");
        } else {
            System.out.println("Even number");
        }
    }

    public static void main(String[] args) {
    oddeven(1);
    oddeven(5);
    oddeven(8);
    }
}
