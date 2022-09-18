package com.java.interviewprog.java8;

import java.util.function.Supplier;

public class GenerateRandomNumberUsingSupplier {
    public static void main(String[] args) {
        Supplier<Integer> generateRandomNumber = () -> {
            int a = (int) (Math.random() * 10) % 10;
            return a;
        };
        System.out.print(generateRandomNumber.get());
    }
}
