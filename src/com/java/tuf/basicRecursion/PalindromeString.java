package com.java.tuf.basicRecursion;

public class PalindromeString {

    private boolean checkForPalindromeString(int start, int end, String value){

        if(start>end/2){
            return true;
        }
       if( value.charAt(start)==value.charAt(end) ){
           start++;
           end--;
       } else {
           return  false;
       }
        return checkForPalindromeString(start, end, value);
    }

    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        String first = "abba";
        String second= "abhijeet ranjan";
        System.out.println(palindromeString.checkForPalindromeString(0, first.length()-1,first));
        System.out.println(palindromeString.checkForPalindromeString(0, second.length()-1,second));

    }


}
