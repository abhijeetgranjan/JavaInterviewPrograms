package com.java.interviewprog;

public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(getSum(1234));
        System.out.println(getSum(9));
        System.out.println("******");
        System.out.println(getSumUsingAscii(1234));
        System.out.println(getSumUsingAscii(9));
    }

    static int getSum(int number) {
        String s = String.valueOf(number);
        int last = Integer.valueOf(String.valueOf(s.charAt(0))) + Integer.valueOf(String.valueOf(s.charAt(s.length() - 1)));
        return last;
    }

    static int getSumUsingAscii(int number){
        String s = String.valueOf(number);
        int first =  s.charAt(0) -'0';
        int last =   s.charAt(s.length()-1) -'0';
        return first+last;
    }
}
