package com.java.interviewprog;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 1, 3};
        NumberOfGoodPairs pairs = new NumberOfGoodPairs();
        System.out.println(pairs.numIdenticalPairs(array));
        int[] array1 = {1, 1, 1, 1};
        System.out.println(pairs.numIdenticalPairs(array1));
        int[] array2 = {1, 2, 3};
        System.out.println(pairs.numIdenticalPairs(array2));
    }

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
