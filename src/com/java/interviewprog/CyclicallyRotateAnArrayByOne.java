package com.java.interviewprog;

public class CyclicallyRotateAnArrayByOne {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        System.out.println(" array before rotation");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(" array after rotation");

        int[] best = rotateArray(array);
        for (int i = 0; i < best.length; i++) {
            System.out.print(best[i] + " ");
        }

    }

    private static int[] rotateArray(int[] array) {
        int length = array.length;
        int first = array[length - 1];
        for (int i = length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = first;
        return array;
    }
}
