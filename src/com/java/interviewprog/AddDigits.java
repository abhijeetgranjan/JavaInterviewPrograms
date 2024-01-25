package com.java.interviewprog;

public class AddDigits {
    public static void main(String[] args) {
        AddDigits digits = new AddDigits();
        System.out.println(digits.addDigits(38));
    }

    public int addDigits(int num){

        String s = String.valueOf(num);
        int sum =0;

        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i)- '0';
            sum= sum+curr;
        }

        if(sum >9){
            sum = addDigits(sum);
        }

        return sum;
    }
}
