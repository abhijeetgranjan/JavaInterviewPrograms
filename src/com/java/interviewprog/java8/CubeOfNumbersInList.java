package com.java.interviewprog.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CubeOfNumbersInList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> collect = integerList.stream().map(i -> (i * i * i)).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


}
