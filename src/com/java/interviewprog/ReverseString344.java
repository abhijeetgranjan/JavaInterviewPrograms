package com.java.interviewprog;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        reverseString1(s);
    }

    static void reverseString(char[] s) {
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
    static void reverseString1(char[] s) {
        int i =0, j =s.length-1;
       while(i<j){
           char temp = s[i];
           s[i]= s[j];
           s[j]= temp;
           i++;
           j--;
       }
        System.out.println(Arrays.toString(s));
    }
}
