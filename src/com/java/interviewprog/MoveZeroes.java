package com.java.interviewprog;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes zeroes = new MoveZeroes();
        zeroes.moveZeroes(new int []{0,1,0,3,12});
        zeroes.moveZeroes(new int []{0});
    }
    public void moveZeroes(int[] nums) {

        int j = 1;
        for (int i = 0; i <= nums.length - 2 && j <= nums.length - 1; ) {

            if (nums[i] == 0 && nums[j] == 0) {
                j++;
            } else if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else {
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
