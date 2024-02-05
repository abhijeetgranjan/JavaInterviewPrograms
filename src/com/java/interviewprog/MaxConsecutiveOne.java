package com.java.interviewprog;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        MaxConsecutiveOne one = new MaxConsecutiveOne();
        System.out.println(one.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(one.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, curr_max =0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                curr_max++;
                if(curr_max>max){
                    max= curr_max;
                }
            }else{
                curr_max=0;
            }
        }
        return max;

    }
}
