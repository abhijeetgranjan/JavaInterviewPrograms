package com.java.interviewprog.java8;

/*

    if n=4  if n=5
     ****     *****
     ****     *****
     ****     *****
     ****     *****
              *****
 */

public class PatternProblem1 {
    public static void main(String[] args) {

        int n =5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
