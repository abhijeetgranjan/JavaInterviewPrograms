package com.java.interviewprog;

import java.util.Arrays;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String [] array = s.split(" ");
        int length = array.length;
        int size= array[length-1].length();
        return size;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));

    }
}
