package com.java.interviewprog;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    static boolean isPalindrome(String s){
        s = s.toLowerCase();
        s= s.replaceAll(" ","").replaceAll("[^a-zA-Z0-9]", "");

        boolean flag = true;

        if(s.length()==0){
            return true;
        }else{
            int i =0, j =s.length()-1;
            while (i<j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    flag = false;
                    break;
                }

            }

        }

        return flag;

    }
}
