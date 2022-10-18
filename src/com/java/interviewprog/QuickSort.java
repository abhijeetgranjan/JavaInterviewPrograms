package com.java.interviewprog;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {30, 45, 15, 11, 1, 65, 21};
        quickSort(array, 0, array.length - 1);
        printArray(array);

    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
    }

    private static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partition = getPartition(array, startIndex, endIndex);
            quickSort(array, startIndex, partition - 1);
            quickSort(array, partition + 1, endIndex);
        }
    }

    private static int getPartition(int[] array, int startIndex, int endIndex) {

        int low = startIndex;
        int high = endIndex;
        int pivot = array[startIndex];

        while (low < high) {
            while (low <= high && array[low] <= pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }

            if (low < high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }

        }


        int temp = array[high];
        array[high] = array[startIndex];
        array[startIndex] = temp;


        return high;
    }
}
