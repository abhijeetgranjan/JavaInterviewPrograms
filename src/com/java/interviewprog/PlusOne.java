package com.java.interviewprog;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne one = new PlusOne();
        System.out.println(Arrays.toString(one.plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(one.plusOne(new int[]{4,3,2,1})));
        System.out.println(Arrays.toString(one.plusOne(new int[]{9})));
        System.out.println(Arrays.toString(one.plusOne(new int[]{9,9})));

    }

    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int[] array = new int[length + 1];


        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = (digits[i] + 1) % 10;
            }
        }

        array[0] = 1;
        return array;


    }


}
