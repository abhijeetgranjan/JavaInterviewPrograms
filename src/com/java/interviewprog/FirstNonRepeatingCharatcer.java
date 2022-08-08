package com.java.interviewprog;

public class FirstNonRepeatingCharatcer {
    public static void main(String[] args) {
        String first = "geeksforgeeks";
        String second = "abcdabc";
        String third = "abhijeet";
        String fourth = "abab";
        firstNonRepeatingCharacter(first);
        firstNonRepeatingCharacter(second);
        firstNonRepeatingCharacter(third);
        firstNonRepeatingCharacter(fourth);
    }

    private static void firstNonRepeatingCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.indexOf(string.charAt(i)) == string.lastIndexOf(string.charAt(i))) {
                System.out.println("the first non repeating character is" + string.charAt(i));
                return;
            }
        }
        System.out.println(" the string doesn't have any repeating character");
    }
}
