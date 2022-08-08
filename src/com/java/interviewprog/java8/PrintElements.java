package com.java.interviewprog.java8;

import java.util.Arrays;

public class PrintElements {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};

        Arrays.stream(array).forEach(i->{
            System.out.println(i);
        });
    }
}
