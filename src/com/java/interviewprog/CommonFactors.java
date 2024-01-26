package com.java.interviewprog;

public class CommonFactors {
    public static void main(String[] args) {
        CommonFactors commonFactors= new CommonFactors();
        System.out.println(commonFactors.commonFactors(12,6));
        System.out.println(commonFactors.commonFactors(25,30));
    }

    public int commonFactors(int a, int b) {
        int smallest = Math.max(a, b);
        int count = 0;
        for (int i = 1; i <= smallest; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
}
