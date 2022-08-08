package com.java.interviewprog;

public class StringSwapWithoutTemp {
    public static void main(String[] args) {
        String first ="This is first string ";
        String second="This is second string";
        swapString(first,second);
    }

    private static void swapString(String first, String second){
        System.out.println("the first string is "+ first+" and second string is "+second+ " before swap ");
        first= first+second;
        second= first.substring(0,first.length()-second.length());
        first= first.substring(second.length());
        System.out.println("the first string is "+ first+" and second string is "+second+ " after swap ");
    }
}
