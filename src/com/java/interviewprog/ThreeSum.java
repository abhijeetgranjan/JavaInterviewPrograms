package com.java.interviewprog;

import java.util.HashSet;
import java.util.Set;

/**
 * Find a triplet that sum to a given value
 * Input: array = {12, 3, 4, 1, 6, 9}, sum = 24;
 * Output: 12, 3, 9
 */

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{12, 3, 4, 1, 6, 9};
        int target = 19 ;

        for (int i = 0; i < nums.length; i++) {
            int currentTarget = target - nums[i];
            int[] value = twoSum(nums, currentTarget,i );
            if (value != null) {
                System.out.println(" the triplets  are " + nums[i] + " and " + value[0] + " and " + value[1]);
            }
        }
    }

    public static int[] twoSum(int[] array, int target, int currentIndex) {
        Set<Integer> mySet = new HashSet<>();
        for (int i = currentIndex+1; i < array.length; i++) {
            int missingNo = target - array[i];
            if (mySet.contains(missingNo)) {
                int[] indexes  = {missingNo,array[i]};
                return indexes;
            } else {
                mySet.add(array[i]);
            }
        }
        return null;
    }
}
