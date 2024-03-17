package com.java.interviewprog;

public class Fiibonacci {
    public int fiboHelper(int n){
        if(  n==0){
            return 0;
        }
        if(  n==1){
            return 1;
        }
        return (fiboHelper(n-1)+ fiboHelper(n-2));
    }

    public int fib(int n) {
        return fiboHelper(n);
    }

    public static void main(String[] args) {
        Fiibonacci fiibonacci= new Fiibonacci();
        System.out.println(fiibonacci.fib(3));
    }
}
