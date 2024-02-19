package com.java.interviewprog;

public class Power {

    public static void main(String[] args) {
        Power p = new Power();
        double v = p.myPow(2, 2);
        System.out.println(v);
    }

    public double helper(double x, int n){
        if(n==0){
            return 1.0;
        }
        double temp = helper(x,n/2);
        if(n%2==0){
            return temp * temp;
        }else{
            return temp * temp * x;
        }


    }


    public double myPow(double x, int n) {

        double result;
        if(n<0){
            result= helper(x, Math.abs(n));
            return 1/result;
        }
        result= helper(x,n);
        return result;


    }
}
