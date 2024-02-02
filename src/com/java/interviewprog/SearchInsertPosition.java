package com.java.interviewprog;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition insertPosition = new SearchInsertPosition();
        int i = insertPosition.searchInsert(new int[]{1, 3, 5, 6}, 5);
        System.out.println(i);
        int k = insertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2);
        System.out.println(k);
        int l = insertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7);
        System.out.println(l);

    }

    public int searchInsert(int[] nums, int target) {

        if(target<nums[0]){
            return 0;
        }

        int mid = nums.length/2;
        if(target == nums[mid]){
            return mid;
        } else if (target > nums[mid]) {
            for (int i = mid; i < nums.length; i++) {
                if(nums[i]== target){
                    return i;
                }else if(i<nums.length-1 && nums[i]<target && target<nums[i+1]){
                    return i+1;
                }
            }
        }else {
            for (int i = 0; i < mid; i++) {
                if(nums[i]== target){
                    return i;
                }else if(i<nums.length-1 && nums[i]<target && target<nums[i+1]){
                    return i+1;
                }
            }
        }

        return  nums.length;
    }
}
