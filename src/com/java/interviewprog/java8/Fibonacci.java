package com.java.interviewprog.java8;

import java.util.concurrent.Callable;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Stream.iterate(new long[]{1, 1}, p -> new long[]{p[1], p[1] + p[0]}).
                limit(5).forEach(p -> System.out.println(p[0]));
    }
}


@FunctionalInterface
 interface myInterface extends Runnable {



    default void sayHello(){
        System.out.println(" print hello");
    }

    default void sayHelloAgain(){
        System.out.println(" print hello again ");
    }


}
