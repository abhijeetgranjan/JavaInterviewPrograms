package com.java.tuf.basicMaths;

public class GCDTwoNumbers {
    public int GCD(int n1, int n2) {
        int i = 1, gcd = 0;
        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static void main(String[] args) {
        GCDTwoNumbers gcdTwoNumbers = new GCDTwoNumbers();
        System.out.println(gcdTwoNumbers.GCD(4, 6));
        System.out.println(gcdTwoNumbers.GCD(8, 9));
    }
}
