package com.java.interviewprog;

public class TwoStringsEquivalent {

    public static void main(String[] args) {
        TwoStringsEquivalent equivalent= new TwoStringsEquivalent();
        boolean b = equivalent.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"});
        System.out.println(b);
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="", s2="";
        for(int i =0; i< word1.length; i++){
            s1= s1.concat(word1[i]);
        }
        for(int i =0; i< word2.length; i++){
            s2= s2.concat(word2[i]);
        }

        if(s1.equalsIgnoreCase(s2)){
            return true;
        }
        return false;
    }
}
