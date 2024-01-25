package com.java.interviewprog.java8;

public class ReverseOnlyLetter {
    public static void main(String[] args) {
        ReverseOnlyLetter reverseOnlyLetter = new ReverseOnlyLetter();
        System.out.println(reverseOnlyLetter.reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetter.reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetter.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
        System.out.println(reverseOnlyLetter.reverseOnlyLetters("7_28]"));
    }

    public String reverseOnlyLetters(String s) {

        char[] charArray = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i <= j) {

            if (91 <= charArray[i] && charArray[i] <= 96) {
                i++;
            } else if (91 <= charArray[j] && charArray[j] <= 96) {
                j--;
            } else if (('A' <= charArray[i] && charArray[i] <= 'z') && ('A' <= charArray[j] && charArray[j] <= 'z')) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            } else if (charArray[i] < 'A') {
                i++;
            } else if (charArray[j] < 'A') {
                j--;
            }

        }
        return String.valueOf(charArray);
    }


}
