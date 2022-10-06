package com.java.interviewprog;

public class Test {
    public static void main(String[] args) {
        int array[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        //System.out.println(binarySearch(array, 17));

        int[] array1 = {8, 3, 9, 7, 5, 4, -10};
        bubbleSort(array1);
        System.out.println();
        selectionSort(array1);
    }

    private static void selectionSort(int[] array1) {
        for (int i = 0; i < array1.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array1.length; j++) {
                if (array1[j] < array1[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array1[min];
                array1[min] = array1[i];
                array1[i] = temp;
            }

        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print(" ");
        }
    }

    private static void bubbleSort(int[] array1) {
        for (int i = array1.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array1[j] > array1[j + 1]) {
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            System.out.print(" ");
        }


    }

    private static int binarySearch(int[] array, int target) {
        return binarySearchImplementation(array, 0, array.length, target);
    }

    private static int binarySearchImplementation(int[] array, int startIndex, int endIndex, int target) {

        if (startIndex < endIndex) {
            int middle = (startIndex + endIndex) / 2;
            if (array[middle] == target) {
                return middle;
            } else {
                if ((array[middle] > target)) {
                    return binarySearchImplementation(array, startIndex, middle, target);
                } else {
                    return binarySearchImplementation(array, middle + 1, endIndex, target);
                }
            }

        }
        return -1;
    }

}
