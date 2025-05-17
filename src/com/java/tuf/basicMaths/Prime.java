package com.java.tuf.basicMaths;

public class Prime {
    public boolean isPrime(int n) {
        //your code goes here

        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Prime prime = new Prime();
        System.out.println(prime.isPrime(15));
        System.out.println(prime.isPrime(11));
    }
}
