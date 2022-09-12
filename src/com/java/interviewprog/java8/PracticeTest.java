package com.java.interviewprog.java8;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeTest {
    public static void main(String[] args) {

        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "abhi");
        integerStringMap.put(2, "qwer");
        integerStringMap.put(3, "ty");
        integerStringMap.put(4, "poi");


        //  (integerStringMap.keySet()).forEach(System.out::println);

        List<String> collect = integerStringMap.keySet().stream().map(m-> integerStringMap.get(m)).collect(Collectors.toList());
        //collect.forEach(System.out::println);

        List<List<String>> lists = new ArrayList<>();
        lists.add(collect);
        List<String> names = Arrays.asList("samsung", "nokia", "vivo", "micromaxx");
        lists.add(names);
        lists.forEach(System.out::println);


        List<String> collect1 = lists.stream().flatMap(m -> m.stream().map(i -> i.toUpperCase())).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        lists.stream().flatMap(m->m.stream()).collect(Collectors.toList()).forEach(System.out::print);
    }
}




