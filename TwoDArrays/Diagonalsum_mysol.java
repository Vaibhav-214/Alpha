package com.company.TwoDArrays;

public class Diagonalsum_mysol {
    public static int diagsum(int [][] matrix){
        int sum = 0;
        int i = 0;

        while(i <= matrix.length - 1) {
            sum += matrix[i][i];
            sum += matrix[i][matrix.length -1 -i];
            i++;
        }
         if(matrix.length % 2 != 0) {
             sum -= matrix[matrix.length/2][matrix.length/2];
         }
        return sum;
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3,4},
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

        System.out.println(diagsum(matrix));
        System.out.println(diagsum(matrix2));

    }
}
