package com.java.interviewprog;

public class MostRepeatedCharInString {
    public static void main(String[] args) {
        String s = "abhiaajjetjjjjaaa";
        System.out.println(mostRepeatedChar(s));
    }

    static char mostRepeatedChar(String s){
        int [] array = new int[256];


        for (int i = 0; i <=s.length()-1; i++) {
            int k = s.charAt(i);
            array[k]++;
        }

        int max_freq= Integer.MIN_VALUE;
        int character= Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max_freq){
                max_freq= array[i];
                character= i;
            }
        }

        return (char) character;
    }
}
