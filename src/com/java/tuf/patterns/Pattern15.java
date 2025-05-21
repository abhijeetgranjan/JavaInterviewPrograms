package com.java.tuf.patterns;


/*

ABCDE
ABCD
ABC
AB
A

 */
public class Pattern15 {
    public static void main(String[] args) {
        for (int i = 5; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                char c = (char) ('A'+j);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
