package com.java.tuf.basicMaths;

public class ReverseANumber {
    public int reverseNumber(int n) {

        int rev = 0;
        while (n != 0) {
            int val = n % 10;
            rev = 10 * rev + val;
            n = n / 10;

        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseANumber aNumber = new ReverseANumber();
        System.out.println(aNumber.reverseNumber(123));
        System.out.println(aNumber.reverseNumber(52));
    }

}
