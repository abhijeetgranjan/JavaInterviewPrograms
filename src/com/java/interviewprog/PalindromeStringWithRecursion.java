package com.java.interviewprog;

public class PalindromeStringWithRecursion {

    public static boolean checkPalindrome(String str, int startIndex, int lastIndex) {
        if (startIndex == lastIndex) {
            return true;
        }
        else{
            if(str.charAt(startIndex) == str.charAt(lastIndex)){
               return checkPalindrome(str, startIndex+1, lastIndex-1);
            }
            else {
                return false;
            }
        }

    }

    private static boolean checkString(String s) {
        return checkPalindrome(s,0,s.length()-1);
    }

    public static void main(String[] args) {
        String first = "ababa";
        System.out.println(checkString(first));

        String second = "poordanisinadroop";
        System.out.println(checkString(second));

        String third = "qwerty";
        System.out.println(checkString(third));
    }


}

