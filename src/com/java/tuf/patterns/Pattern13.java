package com.java.tuf.patterns;

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
public class Pattern13 {
    public static void main(String[] args) {
        int val =1;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(val+" ");
                val++;
            }
            System.out.println();

        }


    }
}
