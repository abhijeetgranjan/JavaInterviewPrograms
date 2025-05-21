package com.java.tuf.patterns;

/*

A
AB
ABC
ABCD
ABCDE

 */
public class Pattern14 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                char c = (char) ('A'+j);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
