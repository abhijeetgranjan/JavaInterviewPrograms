package com.java.interviewprog;

public class PowerOf2 {
    public static void main(String[] args) {

        int n = 1;
        int number = n;
        while (n % 2 == 0) {
            n = n / 2;
        }

        if (n == 1) {
            System.out.println("number " + number + " is power of 2");
        } else {
            System.out.println("number " + number + " is not a power of 2");
        }


    }
}
