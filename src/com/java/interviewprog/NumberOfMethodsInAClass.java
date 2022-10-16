package com.java.interviewprog;

import java.lang.reflect.Method;
import java.util.Arrays;

public class NumberOfMethodsInAClass {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> className = Class.forName("com.java.interviewprog.MergeSort");

        Method[] methods = className.getMethods();
        Arrays.stream(methods).forEach(System.out::println);

        System.out.println("**************");
        Method[] declaredMethods = className.getDeclaredMethods();
        Arrays.stream(declaredMethods).forEach(System.out::println);
    }
}
