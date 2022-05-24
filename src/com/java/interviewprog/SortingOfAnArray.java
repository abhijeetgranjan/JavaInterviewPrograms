package com.java.interviewprog;

/**
 * Program to sort an array
 */
public class SortingOfAnArray {
    public static void main(String[] args) {
        int[] array = {8, 10, 1, 3, 2, 5, 4, 6};
        array = sortAnArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    private static int[] sortAnArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[j];
                    array[j] = array[i];
                    array[i] = k;
                }
            }
        }
        return array;
    }


}


