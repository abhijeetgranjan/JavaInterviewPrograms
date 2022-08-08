package com.java.interviewprog;


import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 26;
        int[] ints = twoSum(nums, target);
        if (ints != null) {
            System.out.println(" the indexes are " + ints[0] + " and " + ints[1]);
        } else {
            System.out.println("Not found");
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] indexes = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int missingNo = target - nums[i];
            if (hashMap.containsKey(missingNo)) {
                indexes[0] = hashMap.get(missingNo);
                indexes[1] = i;
                return indexes;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return null;
    }
}


