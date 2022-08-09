package com.java.interviewprog.java8;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxInAnArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 5, 6, 7, 8, 9, 10};

        OptionalInt max = Arrays.stream(array).max();
        System.out.println(max.isPresent()? "max is " + max.getAsInt(): null);

        OptionalInt min = Arrays.stream(array).min();
        System.out.println(min.isPresent()? "min is " +min.getAsInt(): null);


    }
}
