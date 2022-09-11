package com.java.interviewprog.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EvenOddUsingPredicate {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            integerList.add(i);
        }

        for (int i : integerList) {
            if (integerPredicate.test(i)) {
                System.out.println("the number " + i + " is even ");
            } else {
                System.out.println("the number " + i + " is odd ");
            }
        }
    }
}
