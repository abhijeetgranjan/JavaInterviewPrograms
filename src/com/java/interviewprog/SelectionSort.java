package com.java.interviewprog;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {30, 45, -15, 11, -1, 65, 21};


        for (int i = array.length-1; i >= 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[largest]) {
                    largest = j;
                }

            }
            int k = array[largest];
            array[largest] = array[i];
            array[i] = k;
        }

        for (int k : array) {
            System.out.print(k+" ");

        }
    }
}
