package com.java.tuf.basicRecursion;

public class SumOfNNumbers {

    private int sum(int n){

        if(n ==1){
            return  1;
        }
        return  n + sum(n-1);
    }

    private void sumUsingParameter(int start, int sum){

        if(start ==0){
            System.out.println(sum);
            return;
        }
        sumUsingParameter(start-1,sum+start);
    }

    public static void main(String[] args) {
        SumOfNNumbers sumOfNNumbers = new SumOfNNumbers();
        System.out.println(sumOfNNumbers.sum(10));
        sumOfNNumbers.sumUsingParameter(10,0);
    }

}
