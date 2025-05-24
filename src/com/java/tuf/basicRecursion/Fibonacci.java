package com.java.tuf.basicRecursion;

public class Fibonacci {

    int first,second=1, sum = 0;
    private void printSeries(int start, int end){
        if(start==end){
            return;
        }
        sum = first+ second;
        System.out.println(sum);
        first= second;
        second= sum;
        start= start+1;
        printSeries(start, end);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printSeries(0,8);
    }



}
