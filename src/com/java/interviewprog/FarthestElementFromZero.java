package com.java.interviewprog;

import java.util.Arrays;

public class FarthestElementFromZero {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 3, 4}; // output 5
        printFarthestElementFromZero(array);
        int[] array1 = new int[]{1, -5, 2, 3, 4}; // output 5
        printFarthestElementFromZero(array1);
        int[] array2 = new int[]{21, -5, -42, 3, 4}; // output 42
        printFarthestElementFromZero(array2);
    }

    static void printFarthestElementFromZero(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = array[i] * -1;
            }
        }

        Arrays.sort(array);
        System.out.println(array[array.length - 1]);

    }
}
