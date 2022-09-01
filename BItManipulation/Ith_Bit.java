package com.company.BItManipulation;

public class Ith_Bit {
    public static int setBit(int num, int ith) {
        int bitmask = 1 << ith ;
        return num | bitmask;
    }
    public static int clearBit(int num, int ith) {
        int bitmask = ~(1 << ith);
        return num & bitmask;
    }
    public static int getIthBit(int num, int ith) {
        int bitmask = 1 << ith;
        if ((num & bitmask) == 0){
            return 0;
        } else {
            return 1;
        }
    }
    public static int updateBit(int num, int ith, int setBit) {
        if (setBit == 0){
            return clearBit(num,ith);
        } else {
            return setBit(num,ith);
        }
    }


    public static void main(String[] args) {
        System.out.println(setBit(5,1));
        System.out.println(clearBit(10,1));
        System.out.println(getIthBit(15,4));
    }
}
