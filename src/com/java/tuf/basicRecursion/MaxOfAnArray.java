package com.java.tuf.basicRecursion;

public class MaxOfAnArray {
    int max = 0;

    private int maxArrray(int i, int[] array) {


        if (i < array.length && array[i] > max) {
            max = array[i];
        }
        if (i == array.length - 1) {
            return max;
        }

        i = i + 1;
        return maxArrray(i, array);

    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 5, 3, 4};
        MaxOfAnArray maxOfAnArray = new MaxOfAnArray();
        System.out.println(maxOfAnArray.maxArrray(0, array));

        int[] array1 = new int[]{50, 49, 3, 1, 66, 1000};
        MaxOfAnArray maxOfAnArray1 = new MaxOfAnArray();
        System.out.println(maxOfAnArray1.maxArrray(0, array1));
    }

}
