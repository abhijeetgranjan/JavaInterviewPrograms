package com.java.interviewprog.java8;

import java.util.function.Consumer;

public class PrintUsingConsumer {
    public static void main(String[] args) {

        Consumer<Integer> printNumber = (n) -> System.out.println(" The number is " + n);
        Consumer<String> printString = (name) ->  System.out.println(" The name is " + name);

        printNumber.accept(4);
        printString.accept("Jon Doe");
    }
}
