package com.java.interviewprog;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter {

    public static void main(String[] args) {
        WordsContainingCharacter containingCharacter= new WordsContainingCharacter();
        List<Integer> e = containingCharacter.findWordsContaining(new String[]{"leet", "code"}, 'e');
        e.stream().forEach(System.out::println);
    }


    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> str= new ArrayList<>();

        for(int i = 0; i< words.length; i++){
            if(words[i].contains(String.valueOf(x))){
                str.add(i);
            }
        }
        return str;

    }
}
