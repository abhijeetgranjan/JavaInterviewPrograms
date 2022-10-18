package com.java.interviewprog;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{7, 6, 8, 9, 1, 5, 3}; // 1 3 5 6 7 8 9
        mergeSort(array,0, array.length-1);
        printArray(array);
    }



    static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int middle = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, middle);
            mergeSort(array, middle + 1, endIndex);
            mergeArrays(array, startIndex, middle, endIndex);
        }
    }

    private static  void mergeArrays(int[] array, int startIndex, int middle, int endIndex) {
        int left = startIndex;
        int right = middle + 1;
        int k = startIndex;

        int[] newArray = new int[array.length];

        while (left <= middle && right <= endIndex) {
            if (array[left] < array[right]) {
                newArray[k] = array[left];
                k++;
                left++;
            } else {
                newArray[k] = array[right];
                k++;
                right++;
            }
        }

        if (left > middle) {
            while (right <= endIndex) {
                newArray[k] = array[right];
                right++;
                k++;
            }
        } else {
            while (left <= middle) {
                newArray[k] = array[left];
                left++;
                k++;
            }
        }

        for (int i = startIndex; i <= endIndex; i++) {
            array[i] = newArray[i];
        }
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i+ " ");
        }
    }
}


