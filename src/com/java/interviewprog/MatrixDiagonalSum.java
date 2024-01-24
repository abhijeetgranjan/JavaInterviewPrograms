package com.java.interviewprog;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(mat));
        int[][] mat2 = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        System.out.println(diagonalSum(mat2));
        int [][]mat3= {{5}};
        System.out.println(diagonalSum(mat3));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i <= mat.length - 1; i++) {
            int j = mat[i].length - 1 - i;
            if (i == j) {
                sum += mat[i][i];
            } else {
                sum += mat[i][i] + mat[i][j];
            }
        }
        return sum;

    }
}
