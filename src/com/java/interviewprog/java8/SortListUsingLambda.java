package com.java.interviewprog.java8;

import java.util.*;

public class SortListUsingLambda {
    public static void main(String[] args) {
        List<Integer> integerArrayList = Arrays.asList(10, 20, 5, -1, 30, 23);
        Comparator<Integer> comparator = (i1, i2) -> (i1 > i2) ? 1 : (i1 < i2) ? -1 : 0;
        Collections.sort(integerArrayList, comparator);
        integerArrayList.stream().forEach(System.out::println);
    }

}
