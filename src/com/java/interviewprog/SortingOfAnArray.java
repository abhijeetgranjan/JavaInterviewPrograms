package com.java.interviewprog;

/**
 * Program to sort an array
 */
public class SortingOfAnArray {
    public static void main(String[] args) {
        int[] array = {8, 10, 1, 3, 2, 5, 4, 6};
        array = sortAnArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }

        System.out.println("  ");
        System.out.println(" Binary Search ");
        BinarySearch binarySearch = new BinarySearch();

        for (int i = 0; i < 10; i++) {
            int index = binarySearch.returnIndex(array, i);
            if(index>=0){
                System.out.println(" the number " + i + " is present in array at index " + (index + 1));
            }else{
                System.out.println(" the number "+ i+ " isn't present int the array");
            }
        }




    }

    private static int[] sortAnArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int k = array[j];
                    array[j] = array[i];
                    array[i] = k;
                }
            }
        }
        return array;
    }


}


