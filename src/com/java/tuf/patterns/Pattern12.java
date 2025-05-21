package com.java.tuf.patterns;

/*

 1      1
 12    21
 123  321
 12344321

 */
public class Pattern12 {
    public static void main(String[] args) {
        int k =8;
        for (int i = 1; i < 5; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }

            for (int j = 0; j <((k-2*i)) ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
