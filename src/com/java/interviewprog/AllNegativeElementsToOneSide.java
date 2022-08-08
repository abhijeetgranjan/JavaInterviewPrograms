package com.java.interviewprog;

public class AllNegativeElementsToOneSide {
    public static void main(String[] args) {
        int[] array = {-1, 8, 9, 10, -2, 12, -12, 6, 19, -9 ,- 8};
        moveNegativeElementsToOneSide(array);
        System.out.println();
        int[] array1 = {-1, -8, -9, 10, -2, 12, -12, -6, -19, -9 ,- 8};
        moveNegativeElementsToOneSide(array1);
        System.out.println();
        int[] array2 =  {-1, -8, -9, -10, -2, -12, -12, -6, -19, -9 ,- 8};
        moveNegativeElementsToOneSide(array2);
    }

    private static void moveNegativeElementsToOneSide(int[] array) {
        int low = 0, high = 0, temp;
        for (int i = 0; i < array.length; i++) {
            if (array[high] < 0) {
                temp = array[low];
                array[low] = array[high];
                array[high] = temp;
                high++;
                low++;
            } else {
                high++;
            }
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
