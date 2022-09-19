package com.java.interviewprog;

import java.util.Arrays;
import java.util.OptionalInt;

public class CountingSort {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 0, 0, 1, 2, 1, 1, 2};
        countingSortImpl(array, Arrays.stream(array).min(), Arrays.stream(array).max());

        System.out.println();
        int[] array1 = {1, 2, 8, 8,9, 5, 6,7};
        countingSortImpl(array1, Arrays.stream(array1).min(), Arrays.stream(array1).max());
    }

    private static void countingSortImpl(int[] array, OptionalInt min, OptionalInt max) {
        int[] tempArray = new int[max.getAsInt() + 1];
        int[] output = new int[max.getAsInt() + 1];
        for (int i : array) {
            tempArray[i]++;
        }


        int j = 0;
        for (int i = min.getAsInt(); i <= max.getAsInt(); i++) {
            while (tempArray[i] > 0) {
                array[j] = i;
                tempArray[i]--;
                j++;
            }
        }
        Arrays.stream(array).forEach(i -> System.out.print(i+" "));

    }

}
