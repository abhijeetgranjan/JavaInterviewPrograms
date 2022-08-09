package com.java.interviewprog.java8;

import java.util.Arrays;

public class SquaresOfNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(array).forEach( i->{
            System.out.println( i*i);
        });

    }
}
