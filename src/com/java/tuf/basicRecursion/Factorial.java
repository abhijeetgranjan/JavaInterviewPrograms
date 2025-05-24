package com.java.tuf.basicRecursion;

public class Factorial {

    private int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else return n * factorial(n - 1);
    }

    private void factorialUsingParameter(int n, int mul){
        if(n==1){
            System.out.println(mul);
            return;
        }
        mul = mul*n;
        factorialUsingParameter(n-1, mul);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
        System.out.println(factorial.factorial(1));
        System.out.println(factorial.factorial(0));

       factorial.factorialUsingParameter(5,1);

    }
}
