package com.java.interviewprog;

public class PrintDiagonalElements2DArray {
    public static void main(String[] args) {
        int twoDArray[][] = new int[5][5];
        int k = 1;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = k;
                k++;
            }
        }

        System.out.println("Initial Array");
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonal Elements ");
        for (int i = 0; i < twoDArray.length; i++) {
            System.out.print(twoDArray[i][i]);
            System.out.println();
        }

    }
}
