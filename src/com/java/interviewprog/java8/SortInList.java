package com.java.interviewprog.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortInList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "messi"));
        students.add(new Student(2, "pique"));
        students.add(new Student(3, "busi"));
        students.add(new Student(4, "roberto"));
        System.out.println("sorting a list based of name");
        Stream<Student> sorted = students.stream().sorted(Comparator.comparing(student -> student.getName()));
        sorted.forEach(student -> System.out.println(student.getName()));


        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(6);
        integerList.add(5);
        integerList.add(-4);

        System.out.println("sorting list in natural order");
        List<Integer> collect = integerList.stream().sorted().collect(Collectors.toList());
        collect.stream().forEach(c -> System.out.println(c));

        System.out.println("sorting list in reverse natural order");
        List<Integer> reverseSorting = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverseSorting.stream().forEach(c -> System.out.println(c));


    }

}


