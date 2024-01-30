package com.java.interviewprog;

import java.util.Arrays;
import java.util.List;

public class PairLessThanTarget {
    public static void main(String[] args) {
        PairLessThanTarget pairs = new PairLessThanTarget();
        System.out.println(pairs.countPairs(Arrays.asList(-1,1,2,3,1),2));
        System.out.println(pairs.countPairs(Arrays.asList(-6,2,5,-2,-7,-1,3),-2));
    }

    public int countPairs(List<Integer> nums, int target) {
        int count=0 ;
        for(int i =0; i< nums.size() -1; i++){
            for (int j =i+1; j< nums.size(); j++){
                if((nums.get(i)+nums.get(j))<target){
                    count++;
                }
            }
        }
        return count;
    }
}
