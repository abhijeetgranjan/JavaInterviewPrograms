package com.java.interviewprog;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int twoDArray[][]= new int[3][3];
        int k =1;

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j]=k;
                k++;
            }
        }

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
