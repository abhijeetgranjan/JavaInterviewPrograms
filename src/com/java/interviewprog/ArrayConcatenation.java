package com.java.interviewprog;

import java.util.Arrays;

public class ArrayConcatenation {
    public int[] getConcatenation(int[] nums) {
        int lenght= nums.length;
        int[] array = new int[2*lenght];

        for(int i =0; i<lenght; i++){
            array[i] = nums[i];
            array[i+lenght]= nums[i];
        }


        return array;
    }

    public static void main(String[] args) {
        ArrayConcatenation concatenation = new ArrayConcatenation();
        System.out.println(Arrays.toString(concatenation.getConcatenation(new int[] {1,2,1})));
    }
}
