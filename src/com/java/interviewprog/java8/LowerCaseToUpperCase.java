package com.java.interviewprog.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        System.out.println("*** lowercase to uppercase ****");
        List<String> names = Arrays.asList("samsung", "nokia", "vivo", "micromaxx");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        //names.stream().map(m->m.toUpperCase()).forEach(System.out::println);

        System.out.println();
        System.out.println("*** sorting according to name ****");
        names.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println();
        System.out.println("*** sorting according to length ****");
        names.stream().sorted((c1,c2) -> c1.length()>c2.length() ?1 :c1.length()<c2.length() ?-1:0).
                collect(Collectors.toList()).forEach(System.out::println);
    }
}
