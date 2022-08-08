package com.java.interviewprog;

import java.util.*;




public class SortElementAccordingToOccurrences implements Comparator<Integer> {

    HashMap<Integer, Integer> map ;

    SortElementAccordingToOccurrences(HashMap<Integer, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return map.get(o1).compareTo(map.get(o2));
    }
}
