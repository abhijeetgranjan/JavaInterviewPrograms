package com.java.interviewprog;

public class Test {
    public static void main(String[] args) {
        int array[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println(binarySearch(array, 17));
    }

    private static int binarySearch(int[] array, int target) {
        return binarySearchImplementation(array, 0, array.length , target);
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
