package com.java.interviewprog;

public class SumMultiples {
    public static void main(String[] args) {
        SumMultiples s = new SumMultiples();
        System.out.println(s.countSUme(7));
    }
    private int countSUme(int n ){
        int count = 0;
        for(int i =1; i<=n;i++){
            if(i%3==0||i%5==0||i%7==0){
                count = count+i;
            }
        }
        return count;
    }
}
