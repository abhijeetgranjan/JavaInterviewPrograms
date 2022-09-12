package com.java.interviewprog.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "mnb");
        integerStringMap.put(2, "qwer");
        integerStringMap.put(3, "ty");
        integerStringMap.put(4, "poi");


        (integerStringMap.keySet()).forEach(System.out::println);

        List<String> collect = integerStringMap.keySet().stream().map(m-> integerStringMap.get(m)).collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}
