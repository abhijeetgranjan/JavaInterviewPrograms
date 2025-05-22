package com.java.tuf.patterns;

/*

 */

public class Pattern21 {
    private void printPattern21(int k) {

        int n = k % 2 == 0 ? k / 2 : (k + 1) / 2;

        for (int i = 0; i < k; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < k; i++) {
            System.out.print("*");
        }

    }

    public static void main(String[] args) {
        Pattern21 pattern22 = new Pattern21();
        pattern22.printPattern21(4);
        System.out.println("**********");
        pattern22.printPattern21(5);
    }
}
