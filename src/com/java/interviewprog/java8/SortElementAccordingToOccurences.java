package com.java.interviewprog.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SortElementAccordingToOccurences {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 56, 78, 1, 2, 2, 3, 78, 1, 1, 11, 4);
        HashMap<Integer, Integer> myHashmap = new HashMap<>();
        integerList.forEach(a -> {
            if (myHashmap.containsKey(a)) {
                myHashmap.put(a, myHashmap.get(a) + 1);
            } else {
                myHashmap.put(a, 1);
            }
        });


        myHashmap.forEach((key, value) -> System.out.println(" the element " + key + " has " + value + " occurrence "));
        myHashmap.keySet().stream().sorted((i1, i2) -> myHashmap.get(i1) > myHashmap.get(i2) ? 1 : myHashmap.get(i1) < myHashmap.get(i2) ? -1 : 0).
                collect(Collectors.toList()).forEach(e -> System.out.print(" " +e+ ""));


    }


}
