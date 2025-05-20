package com.java.tuf.patterns;

/*

1
01
101
0101
10101

 */

public class Pattern11 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((i+j+1)%2);
            }
            System.out.println();
        }

    }
}
