package com.java.interviewprog;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate duplicate  = new ContainsDuplicate();
        System.out.println(duplicate.containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(duplicate.containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(duplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int i =0 ;i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
