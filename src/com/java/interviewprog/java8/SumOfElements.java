package com.java.interviewprog.java8;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumOfElements {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        int sum =0;

        int sum1 = Arrays.stream(array).sum();
        System.out.println(sum1);

        OptionalDouble average = Arrays.stream(array).average();
        System.out.println(average);


    }
}
