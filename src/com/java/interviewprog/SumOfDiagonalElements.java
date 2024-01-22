package com.java.interviewprog;

public class SumOfDiagonalElements {
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

        int sum = 0;


        System.out.print("Diagonal Elements are: ");
        for (int i = 0; i < twoDArray.length; i++) {
            System.out.print(twoDArray[i][i]+" ");
            sum = sum+ twoDArray[i][i];
        }
        System.out.println();

        System.out.println("Sum of diagonal elements = "+sum);
    }
}
