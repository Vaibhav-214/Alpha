package com.company.Recursion;

public class BinaryString_mysol {
    public static void printStrings(int n, StringBuilder sb) {

        if (sb.length() == 0) {
            sb.append('0');
            printStrings(n-1,sb);
            sb.deleteCharAt(sb.length() - 1);
            sb.append('1');
            printStrings(n-1,sb);
            sb.deleteCharAt(sb.length() - 1);

        } else {
            sb.append('0');
            if (n == 1) {
                System.out.println(sb.toString());
            } else {
                printStrings(n-1,sb);
            }
            sb.deleteCharAt(sb.length() - 1);
            if (sb.charAt(sb.length() - 1) == '0' ) {
                sb.append('1');
                if (n == 1) {
                    System.out.println(sb.toString());
                } else {
                    printStrings(n-1,sb);
                }
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        printStrings(7,new StringBuilder(""));
    }
}
