package com.java.interviewprog;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        String next = scanner.nextLine();
        reverseString(next);
    }

    public static String reverseString(String reverse) {
        String reversedString = "";
        for (int i = reverse.length() - 1; i >= 0; i--) {
            char c = reverse.charAt(i);
            reversedString = reversedString + c;
        }
        System.out.println(" the reversed String is " + reversedString);
        return  reversedString;
    }
}
