package com.java.interviewprog;

import java.util.*;

public class OccurrenceOfElementInArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 56, 78, 1, 2, 2, 3, 78, 1, 1, 11, 4};
        HashMap<Integer, Integer> myHashmap = new HashMap<>();

        Arrays.stream(array).forEach(a -> {
            if (myHashmap.containsKey(a)) {
                myHashmap.put(a, myHashmap.get(a) + 1);
            } else {
                myHashmap.put(a, 1);
            }
        });

        myHashmap.forEach((key, value) -> System.out.println(" the element " + key + " has " + value + " occurrence "));
        SortElementAccordingToOccurrences sortHashmap = new SortElementAccordingToOccurrences(myHashmap);
        List<Integer> collect = new ArrayList<>(myHashmap.keySet());
        collect.sort(sortHashmap);


        System.out.print(" element with min to max occurrences");
        for (Integer integer : collect) {
            System.out.print("  " + integer);
        }
    }
}




