package com.java.interviewprog.java8;

import java.util.Arrays;

public class SumOfSquares {
    public static void main(String[] args) {

        int[] array = {2, 3, 1, 4, 5, 6, 7, 8, 9, 10};
        int sum =0;

        int reduce = Arrays.stream(array).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(reduce);

        int reduce1 = Arrays.stream(array).filter(i->i%2==0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(reduce1);
    }
}
