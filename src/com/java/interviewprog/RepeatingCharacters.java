package com.java.interviewprog;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacters {
    public static void main(String[] args) {
        printRepeatingCharactersInWord("java");
        printRepeatingCharactersInWord("Programming");
        printRepeatingCharactersInWord("Mobile");
    }

    private static void printRepeatingCharactersInWord(String value) {
        HashMap<Character,Integer> hashmap = new HashMap<>();

        value = value.toLowerCase();
        for (int i = 0; i < value.length(); i++) {
            char c= value.charAt(i);
            if(hashmap.containsKey(c)){
                hashmap.put(c,hashmap.get(c)+1);
            }else {
                hashmap.put(c,1);
            }
        }
        System.out.println(" The word "+ value +" has the repeating character(s) ");
        for(Map.Entry<Character,Integer> entry: hashmap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("   " +entry.getKey()+" => " +
                        ""+ entry.getValue());
            }

        }
    }

}
