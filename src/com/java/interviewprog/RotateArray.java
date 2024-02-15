package com.java.interviewprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {

    public static void main(String[] args) {
        RotateArray array = new RotateArray();
        array.rotate(new int[]{1,2,3,4,5,6,7},3);
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        List<Integer> list= new ArrayList<Integer>();
        for(int i =nums.length-k; i< nums.length; i++){
            list.add(nums[i]);
        }
        for(int i = nums.length-1; i>=k; i--){
            nums[i]= nums[i-k];
        }
        for(int i =0; i<k ;i++){
            nums[i]= list.get(i);
        }

        Arrays.stream(nums).forEach(System.out::println);

    }
}
