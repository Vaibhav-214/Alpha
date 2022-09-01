package com.company.BItManipulation;

public class LastBits {
    public static int clearLastBits(int num, int i) {
        //To clear(make 0) last i bits of num
        int bitmask = ~0 << i;
        return num & bitmask;
    }
    public static int clearRangeBits(int num, int i, int j) {
        int a = ~0 << (j+1);
        int b = (1 << i) - 1;
        int bitmask = a | b;
        return num & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeBits(15,2,3));
    }
}
