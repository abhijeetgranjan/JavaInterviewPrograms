package com.java.interviewprog;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(1));
        System.out.println(isUgly(6));
        System.out.println(isUgly(14));
        System.out.println(isUgly(8));
    }

    public static boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        for(int i = 2; i<6; i++){
            while(n%i==0){
                n = n/i;
            }
        }
        return n==1;
}
}
