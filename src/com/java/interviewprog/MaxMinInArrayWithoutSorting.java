package com.java.interviewprog;


import java.util.Arrays;

public class MaxMinInArrayWithoutSorting {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        int []maxmin = getMaxMin(array);
        System.out.println("max = "+maxmin[0] +", min = " + maxmin[1]);

        int[] array1 = {7};
        int []maxmin1 = getMaxMin(array1);
        System.out.println("max = "+maxmin1[0] +", min = " + maxmin1[1]);

    }

    private static  int[] getMaxMin(int array[]){
        int max = array[0];
        int min = array[0];

        for( int i =1; i<array.length-1; i++){
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        return new int[]{max, min};
    }
}
