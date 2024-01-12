package com.java.interviewprog;

import java.util.Arrays;

public class ArrayProblem012DutchFlagApproach {
    public static void main(String[] args) {
        int array[] = {0, 0, 1, 1, 0, 1, 0, 2, 2};
        sortArrayOn012(array);
        System.out.println();
        int array1[] = {0, 0, 1, 1, 0, 1, 0, 2, 2, 0,1,2,0,1};
        sortArrayOn012(array1);
    }


    private static void sortArrayOn012(int[] array) {
        int low = 0, mid = 0, high = array.length - 1;
        int temp;

        while (mid <= high) {
            switch (array[mid]) {
                case 0:
                    temp = array[low];
                    array[low] = array[mid];
                    array[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = array[high];
                    array[high] = array[mid];
                    array[mid] = temp;
                    high--;
                    break;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
