package com.java.tuf.patterns;

/*

A
BB
CCC
DDDD
EEEEE

 */
public class Pattern16 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                char c = (char) ('A'+i) ;
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
