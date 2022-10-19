package com.java.interviewprog;


/*
      given a string if by replacing the character ? with some other character , if it's a palindrome print the string else print no
      ex 1) ?ab??a can be converted to palindrome by aabbaa
      2) ?a? by replacing ? with any same alphabet we can obtain palindrome
      3)   ab?d -- this can't be palindrome by replacing ? with any alphabet hence output would be no
 */


public class PalindromeQuestionMarkCodility {
    public static void main(String[] args) {
        printOutput("?ab??a");
        printOutput("?a?");
        printOutput("ab?d");
    }

    static void printOutput(String s) {

        StringBuilder original = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '?') {
                char replacedChar = s.charAt(s.length() - 1 - i);
                if (replacedChar == '?') {
                    replacedChar = 'a';
                }
                original.setCharAt(i, replacedChar);
            }
        }
        s = original.toString();
        StringBuilder stringBuilder = new StringBuilder(s);
        String reversed = stringBuilder.reverse().toString();

        if (s.equalsIgnoreCase(reversed)) {
            System.out.println(s + " is palindrome");
        } else {
            System.out.println("no");
        }

    }
}
