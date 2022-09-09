package com.company.Recursion;

public class FriendsParing {
    public static int noOfWays(int n) {
        if (n == 1 || n == 2) {
            return n;// base case
        }
        int fnm1 = noOfWays(n-1);//no of ways if the person chooses to be single
        int fnm2 = noOfWays(n-2);//pair banane ke baad kitne ways hai for remaining people
        int pairways = (n-1)*fnm2;
        // because person has n-1 people to chose from and for each person he chooses, there
        // will be remaining noOfWays(n-2) corresponding to each person chosen.
        int totalways = fnm1 + pairways;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(noOfWays(3));
    }
}
