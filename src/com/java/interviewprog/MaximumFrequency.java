package com.java.interviewprog;

public class MaximumFrequency {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrquencyElements(nums));

        int nums1[] = {1, 2, 3, 4, 5};
        System.out.println(maxFrquencyElements(nums1));

        int nums2[] = {10, 12, 11, 9, 6, 19, 11};
        System.out.println(maxFrquencyElements(nums2));
    }

    static int maxFrquencyElements(int[] nums) {
        int array[] = new int[101];

        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            array[number]++;
        }
        int max_freq = Integer.MIN_VALUE, curr = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= curr) {
                curr = array[i];
                if (curr > max_freq) {
                    max_freq = curr;
                    sum = array[i];
                } else {
                    sum += array[i];
                }
            }
        }

        return sum;
    }


}

