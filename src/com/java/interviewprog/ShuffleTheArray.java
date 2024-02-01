package com.java.interviewprog;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        ShuffleTheArray array = new ShuffleTheArray();
        int[] shuffle = array.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.println(Arrays.toString(shuffle));
    }

    public int[] shuffle(int[] nums, int n) {
        int[] array = new int[2 * n];

        int k = 0, j = 1;
        for (int i = 0; i < (nums.length / 2); i++) {
            array[k] = nums[i];
            k = k + 2;
        }
        for (int i = nums.length / 2; i < nums.length; i++) {
            array[j] = nums[i];
            j = j + 2;
        }
        return array;
    }

}
