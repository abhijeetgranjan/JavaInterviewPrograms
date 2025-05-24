package com.java.tuf.basicRecursion;

import java.util.Arrays;

public class ReverseArray {

    private int[] reverseArray(int firstIndex, int secondIndex, int[] array) {
        if (firstIndex > secondIndex / 2) {
            return array;
        }
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        firstIndex++;
        secondIndex--;
        return reverseArray(firstIndex, secondIndex, array);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        ReverseArray reverseArray = new ReverseArray();
        int[] ints = reverseArray.reverseArray(0, array.length - 1, array);
        Arrays.stream(ints).forEach(i -> System.out.print(i + " "));
    }
}
