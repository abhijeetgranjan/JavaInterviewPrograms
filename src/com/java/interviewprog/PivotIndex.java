package com.java.interviewprog;

public class PivotIndex {
    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();
        int i = pivotIndex.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        System.out.println(i);
        int j = pivotIndex.pivotIndex(new int[]{1, 2, 3});
        System.out.println(j);
        int k = pivotIndex.pivotIndex(new int[]{2,1,-1});
        System.out.println(k);

    }

    public int pivotIndex(int[] nums) {
        int left[]= new int[nums.length];
        int right[]= new int[nums.length];

        int prev =0;
        left[0]= 0;
        for(int i =1; i< left.length; i++){
            left[i]= nums[i-1]+prev;
            prev=left[i];
        }
        right[right.length-1]= 0;
        prev=0;
        for(int i =right.length-2; i>=0; i--){
            right[i]= nums[i+1]+prev;
            prev=right[i];
        }

        for(int i =0; i< nums.length; i++){
            if(left[i]==right[i]){
                return i;
            }
        }
        return -1;
    }
}
