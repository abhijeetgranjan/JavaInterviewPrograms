package com.java.interviewprog;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {30, 45, -15, 11, -1, 65, 21};

        for (int i = 1; i < array.length; i++) {
            int largest = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > largest; j--) {
                array[j] = array[j - 1];
            }
            array[j] = largest;
        }
        for (int k : array) {
            System.out.print(k+" ");
        }
    }
}
