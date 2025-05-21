package com.java.tuf.patterns;

/*

   A
  ABA
 ABCBA
ABCDCBA
 */
public class Pattern17 {

    void printPattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = n - 1 - i; j >= 0; j--) {
                System.out.print(" ");
            }

            int k = 0;
            for (int j = 0; j <= i; j++) {
                char c = (char) ('A' + j);
                System.out.print(c);
                k++;
            }

            for (int j = 1; j <= i; j++) {
                char c = (char) ('A' + (k - 2));
                System.out.print(c);
                k--;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern17 pattern17 = new Pattern17();
        pattern17.printPattern(4);
    }

}
