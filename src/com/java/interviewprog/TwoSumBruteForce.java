package com.java.interviewprog;

import java.util.Arrays;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        TwoSumBruteForce twoSumBruteForce = new TwoSumBruteForce();
        int[] ints = twoSumBruteForce.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        int array [] = new int[2];
        for(int i =0; i< nums.length-1; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] + nums[j]==target){
                    array[0]=i;
                    array[1]=j;
                }
            }
        }
        return array;
    }
}
