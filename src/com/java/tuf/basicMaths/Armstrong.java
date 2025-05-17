package com.java.tuf.basicMaths;

public class Armstrong {
    public boolean isArmstrong(int n) {

        int i = 0, sum = 0, count = 0, ori = n, num = n;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        while (num != 0) {
            i = num % 10;
            sum = (int) (sum + Math.pow(i, count));
            num = num / 10;

        }
        if (sum == ori) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Armstrong armstrong = new Armstrong();
        System.out.println(armstrong.isArmstrong(153));
        System.out.println(armstrong.isArmstrong(12));
        System.out.println(armstrong.isArmstrong(1634));
    }
}
