package com.java.interviewprog;

import java.util.Scanner;

public class StringReversal {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the string ");
        String next = scanner.nextLine();

       // String next ="My name is abhijeet";
        reverseString(next);
    }

    private static void reverseString(String reverse){
        String reversedString = new String();
        for(int i=reverse.length()-1; i>=0;i--){
            char c = reverse.charAt(i);
            reversedString = reversedString+c;
        }

        System.out.println(" the reversed String is "+reversedString);

    }
}
