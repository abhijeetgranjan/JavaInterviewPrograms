package com.java.interviewprog;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    static boolean isPalindrome(int x) {
        int ori = x, sum = 0;
        if (x >= 0) {
            while (x >0) {
                int y = x % 10;
                sum = 10*sum+ y;
                x = x / 10;
            }
        } else {
            return false;
        }

        if (sum == ori) {
            return true;
        }
        return false;
    }
}
