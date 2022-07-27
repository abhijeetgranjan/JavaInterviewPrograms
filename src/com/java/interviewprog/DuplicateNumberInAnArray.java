package com.java.interviewprog;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberInAnArray {
    public static void main(String[] args) {
        int[] array = {7, 1, 1,5, 3, 6, 4};
        int duplicateInArray = getDuplicateInArray(array);
        System.out.println(duplicateInArray);

        int[] array1 = {10, 22, 5, 75, 65, 80,22};
        int duplicateInArray1 = getDuplicateInArray(array1);
        System.out.println(duplicateInArray1);
    }

    private static int getDuplicateInArray(int[] array) {
        Set<Integer> myhashSet = new HashSet<>(array.length-1);
        for (int i = 0; i < array.length; i++) {
            if(!myhashSet.contains(array[i])){
                myhashSet.add(array[i]);
            }else{
                return array[i];
            }
        }
        return -1;
    }


}
