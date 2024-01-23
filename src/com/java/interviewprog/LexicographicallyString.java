package com.java.interviewprog;

import java.util.Scanner;

public class LexicographicallyString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();

        System.out.println(compareString(first,second));

        /*System.out.println(compareString("aaaa","aaaA"));
        System.out.println(compareString("abs","Abz"));
        System.out.println(compareString("abcdefg","AbCdEfF"));*/
    }

    static int compareString( String first, String second){

        first = first.toLowerCase();
        second= second.toLowerCase();

        for (int i = 0; i <=first.length()-1; i++) {

            if(first.charAt(i)==second.charAt(i)){

            } else if (first.charAt(i)<second.charAt(i)) {
                return -1;
            }else if (first.charAt(i)>second.charAt(i)) {
                return 1;
            }
        }
        return 0;
    }
}
