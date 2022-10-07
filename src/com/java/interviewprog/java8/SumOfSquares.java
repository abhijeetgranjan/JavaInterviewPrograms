package com.java.interviewprog.java8;

import java.util.Arrays;

public class SumOfSquares {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 4, 5, 6, 7, 8, 9, 10};

        int allNoSum = Arrays.stream(array).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(allNoSum);

        int evenNoSum = Arrays.stream(array).filter(i->i%2==0).map(n -> n * n).reduce(0, Integer::sum);
        System.out.println(evenNoSum);
    }
}
