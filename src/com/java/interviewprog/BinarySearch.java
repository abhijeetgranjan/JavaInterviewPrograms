package com.java.interviewprog;


/*
Search the element using Binary Search
 */
public class BinarySearch {

    public int returnIndex(int[] array, int element) {

        int middle = array.length / 2;
        return BinarySearch(array,0, array.length,element);
    }


    public int BinarySearch(int[] array, int start, int end, int element) {

        if (start < end) {
            int middle = (start + end) / 2;

            if (array[middle] == element) {
                return middle;
            } else {
                if (array[middle] < element) {
                    return BinarySearch(array, start, middle, element);
                } else {
                    return BinarySearch(array, middle + 1, end, element);
                }
            }
        }
        return -1;
    }
}
