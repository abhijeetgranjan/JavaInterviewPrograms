package com.java.interviewprog;

/*
if n =5
 *****
  *****
   *****
    *****
     *****
 */

public class PatternProblem2 {
    public static void main(String[] args) {
        int n = 5;
        String s = "";
        for (int i = 0; i < n; i++) {
            System.out.print(s);
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            s = s.concat(" ");
            System.out.println();
        }
    }
}
