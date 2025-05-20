package com.java.tuf.patterns;

/*


 *********
  *******
   *****
    ***
     *


 */
public class Pattern8 {
    public static void main(String[] args) {

        for (int i = 4; i >=0 ; i--) {
            for (int j = i; j <5; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
