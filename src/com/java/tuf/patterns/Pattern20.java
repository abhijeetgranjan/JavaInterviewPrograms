package com.java.tuf.patterns;

/*

 *        *
 **      **
 ***    ***
 ****  ****
 **********
 ****  ****
 ***    ***
 **      **
 *        *

 */
public class Pattern20 {

    private void printPattern20(int k) {
        int n = k / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i < k; i++) {
            for (int j = 0; j < k - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= ((n + i) - k); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < k - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Pattern20 pattern21 = new Pattern20();
        pattern21.printPattern20(9);
    }

}
