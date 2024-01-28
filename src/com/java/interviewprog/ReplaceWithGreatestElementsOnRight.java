package com.java.interviewprog;

import java.util.Arrays;

public class ReplaceWithGreatestElementsOnRight {
    public static void main(String[] args) {
        ReplaceWithGreatestElementsOnRight replace = new ReplaceWithGreatestElementsOnRight();
        int[] ints = replace.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        System.out.println(Arrays.toString(ints));
        int[] arr = replace.replaceElements(new int []{400});
        System.out.println(Arrays.toString(arr));
    }

    public int[] replaceElements(int[] arr) {
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        int curr;
        if (arr.length > 1) {
            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] > temp) {
                    curr = arr[i];
                    arr[i] = temp;
                    temp = curr;
                } else {
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
