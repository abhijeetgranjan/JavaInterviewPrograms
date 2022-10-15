package com.java.interviewprog;

import java.util.function.Supplier;

public class Coforge {
    public static void main(String[] args) {


        Supplier<Double> randomNumber = Math::random;

        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumber.get());
        }

    }





}
