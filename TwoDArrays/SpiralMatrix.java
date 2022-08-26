package com.company.TwoDArrays;

public class SpiralMatrix {
    public static void spiral(int [][] matrix) {
        int srtrow = 0;
        int endrow = matrix.length-1;
        int srtcol = 0;
        int endcol = matrix[0].length-1;

        while (srtrow <= endrow && srtcol <= endcol) {//It should be less than or equal to So it will work for odd crossed square and
            // it has && so that it works for non-square matrices also
            //TOP
            for (int j = srtcol; j <= endcol; j++) {
                System.out.print(matrix[srtrow][j]+ " ");
            }
            // RIGHT
            for (int i = srtrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol]+ " ");
            }
            // BOTTOM
            for (int j = endcol - 1; j >= srtcol; j--) {

                if(srtrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");
            }
            //LEFT
            for (int i = endrow - 1; i >= srtrow + 1; i--) {
                if(srtcol == endcol){
                    break;
                }
                System.out.print(matrix[i][srtcol]+ " ");
            }
            //update for next spiral
            srtrow++;
            endrow--;
            srtcol++;
            endcol--;
        }
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
        spiral(matrix);
        System.out.println();
        spiral(matrix2);
        System.out.println();
        spiral(matrix3);
    }
}
