package com.java.interviewprog;

public class ReverseString {
    public static void main(String[] args) {
        String s ="abhijeet";
        String reverse="";
        for (int i = s.length()-1; i >=0 ; i--) {
            char c= s.charAt(i);
            reverse= reverse.concat(String.valueOf(c));
        }
        System.out.println(reverse);
    }
}
