package com.java.interviewprog;

import java.util.Arrays;

public class MinimumNumberGame {
    public static void main(String[] args) {
        MinimumNumberGame game = new MinimumNumberGame();
        int[] ints = game.numberGame(new int[]{5, 4, 2, 3});
        System.out.println(Arrays.toString(ints));
    }
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[]array = new int[nums.length];
        for( int i = 0; i< nums.length; i=i+2){
            array[i]= nums[i+1];
            array[i+1]= nums[i];
        }
        return array;
    }
}
