package com.java.interviewprog.java8;
import java.util.function.Function;

public class SquareUsingFunction {

    public static void main(String[] args) {
        Function<Integer, Integer> getSquare = n -> n * n;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Square of " + i + " = " + getSquare.apply(i));
        }
    }
}
