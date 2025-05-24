package com.java.tuf.basicRecursion;

//Time Complexity :0(2^n) -- exponential
public class FibonacciNumber {


    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        System.out.println(fibonacciNumber.fib(4));
        System.out.println(fibonacciNumber.fib(1));
    }
}
