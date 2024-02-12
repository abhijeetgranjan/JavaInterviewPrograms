package com.java.interviewprog;

import java.util.Arrays;

public class RunningSumOf1DArray {

    public static void main(String[] args) {
        RunningSumOf1DArray runningSumOf1DArray= new RunningSumOf1DArray();
        int[] ints = runningSumOf1DArray.runningSum(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(ints));
    }

    public int[] runningSum(int[] nums) {
        int length= nums.length;
        int [] array = new int[length];
        int currSum=0;
        for(int i =0;i<length;i++){
            currSum+= nums[i];
            array[i]= currSum;
        }
        return array;
    }
}
