package com.java.tuf.patterns;

/*

E
DE
CDE
BCDE
ABCDE
 */

public class Pattern18 {

    void printPattern18(int n){

        for (int i = 0; i <n ; i++) {
            int k = n-i-1;
            for (int j = 0; j <=i && k<=n ; j++, k++) {
                char c = (char) ('A'+k);
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern18 pattern18 = new Pattern18();
        pattern18.printPattern18(5);

        System.out.println("***********");
        pattern18.printPattern18(6);
    }

}
