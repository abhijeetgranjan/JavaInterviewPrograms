package com.java.tuf.basicMaths;

public class CountAllDigitsOfANumber {
    public int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountAllDigitsOfANumber countAllDigitsOfANumber = new CountAllDigitsOfANumber();
        System.out.println(countAllDigitsOfANumber.countDigit(100));
        System.out.println(countAllDigitsOfANumber.countDigit(123456));
        System.out.println(countAllDigitsOfANumber.countDigit(0));
    }
}
