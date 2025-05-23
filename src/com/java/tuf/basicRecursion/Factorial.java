package com.java.tuf.basicRecursion;

public class Factorial {

    private int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
        System.out.println(factorial.factorial(1));
        System.out.println(factorial.factorial(0));
    }
}
