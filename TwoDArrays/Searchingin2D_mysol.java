package com.company.TwoDArrays;

public class Searchingin2D_mysol {
    public static int search(int [][] matrix, int key){
        int start = 0;
        int end = matrix.length - 1;
        int mid = end - (end - start) / 2;
        int mid2 = -1;
        while (start <= end) {
            if (key < matrix[mid][matrix[mid].length - 1] && key <= matrix[mid - 1][matrix[mid - 1].length - 1]) {
                end = mid - 1;
                mid = end - (end - start) / 2;

            }else if (key > matrix[mid][matrix[mid].length - 1]){
                start = mid + 1;
                mid = end - (end - start) / 2;

            }else {
                if(mid2 == -1) {
                    start = 0;
                    end = matrix[mid].length - 1;
                    mid2 = end - (end - start) / 2;
                }else {
                    if (key == matrix[mid][mid2]) {
                        System.out.print(mid+" ");
                        return mid2;
                    }
                    else if (key > matrix[mid][mid2]) {
                        start = mid2 + 1;
                        mid2 = end - (end - start) / 2;

                    }else {
                        end = mid2-1;
                        mid2 = end - (end - start) / 2;

                    }
                }
            }
        }
        return -1;
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
        System.out.println(search(matrix3, 10));
    }
}
