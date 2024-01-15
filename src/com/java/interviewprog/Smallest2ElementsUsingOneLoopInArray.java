package com.java.interviewprog;

public class Smallest2ElementsUsingOneLoopInArray {
    public static void main(String[] args) {
        int[] array = {1, 11, 15, -5, 66, 7, 81, 9,};
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < first) {
                second = first;
                first = array[i];
            } else if (array[i] < second) {
                second = array[i];
            }
        }

        System.out.println(first);
        System.out.println(second);


    }
}
