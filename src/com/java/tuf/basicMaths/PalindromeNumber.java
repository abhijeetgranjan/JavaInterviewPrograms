package com.java.tuf.basicMaths;

class PalindromeNumber {
    public boolean isPalindrome(int n) {

        int ori = n;
        int rev = 0;
        while (n != 0) {
            int val = n % 10;
            rev = 10 * rev + val;
            n = n / 10;

        }
        if (rev == ori) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(" the number 153 is palindrome " + palindromeNumber.isPalindrome(153));
        System.out.println(" the number 121 is palindrome " + palindromeNumber.isPalindrome(121));
        System.out.println(" the number 123 is palindrome " + palindromeNumber.isPalindrome(123));
    }
}




