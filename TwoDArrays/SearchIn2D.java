package com.company.TwoDArrays;

public class SearchIn2D {
    public static boolean search(int [][] matrix, int key){
        int i = 0;
        int j = matrix[i].length-1;

        while (i <= matrix.length - 1 && j >= 0) {
            if (key == matrix[i][j]) {
                System.out.println(i+" "+j);
                return true;
            }else if (key < matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
       return false;
    }
    public static void main(String[] args) {
        int [][] matrix = { {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int [][] matrix2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        int [][] matrix3 = {
                {1,2,3,},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15}
        };
        System.out.println(search(matrix, 10));
        System.out.println(search(matrix2, 10));
        System.out.println(search(matrix3, 15));
    }
}
