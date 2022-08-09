package com.java.interviewprog.java8;

import java.util.Arrays;

public class PrintOddNosInArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10};

        //Arrays.stream(array).filter(i-> (i%2 !=0)).forEach( i-> System.out.println(i));
        Arrays.stream(array).filter(i-> (i%2 !=0)).forEach(System.out::println);
    }
}
