package com.java.interviewprog;

import java.util.Arrays;
import java.util.Locale;

public class StringAnagrams {
    public static void main(String[] args) {
        String first = "cat";
        String second = "tac";
        String third = "tat";
        String forth = "cast";
        String fifth="cat ";

        System.out.println(" the string " +first +" and "+ second +" are anagrams = "+checkIfAnagram(first,second));
        System.out.println(" the string " +third +" and "+ forth +" are anagrams = "+checkIfAnagram(third,forth));
        System.out.println(" the string " +third +" and "+ first +" are anagrams = "+checkIfAnagram(third,first));
        System.out.println(" the string " +fifth +" and "+ first +" are anagrams = "+checkIfAnagram(first,first));

    }

    private static boolean checkIfAnagram(String first, String second) {

        first = first.replaceAll("\\s", "");
        second = second.replaceAll("\\s", "");

        if (first.length() != second.length()) {
            return false;
        } else {
            char[] firstArray = first.toLowerCase().toCharArray();
            char[] secondArray = second.toLowerCase().toCharArray();
            Arrays.sort(firstArray);
            Arrays.sort(secondArray);
            return Arrays.equals(firstArray, secondArray);
        }
    }
}
