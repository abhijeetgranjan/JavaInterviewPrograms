package com.java.tuf.basicRecursion;

public class MinOfAnArray {

    int min = Integer.MAX_VALUE;
    private int minArrray(int i, int[] array) {


        if (i < array.length && array[i] < min) {
            min = array[i];
        }
        if (i == array.length - 1) {
            return min;
        }

        i = i + 1;
        return minArrray(i, array);

    }

    public static void main(String[] args) {
        int[] array = new int[]{11, 2, 5, 3, 4};
        MinOfAnArray minOfAnArray = new MinOfAnArray();
        System.out.println(minOfAnArray.minArrray(0, array));

        int[] array1 = new int[]{50, 49, 3, 1, 66, 1000};
        System.out.println(minOfAnArray.minArrray(0, array1));
    }
}
