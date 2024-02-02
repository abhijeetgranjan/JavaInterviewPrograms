package com.java.interviewprog;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber number = new MissingNumber();
        int i = number.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(i);
    }

    public int missingNumber(int[] nums) {
        int length = nums.length;
        int missingValue = 0;
        int[] array = new int[length + 1];

        for (int i = 0; i < length; i++) {
            int value = nums[i];
            array[value]++;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                missingValue = i;
            }
        }
        return missingValue;

    }
}
