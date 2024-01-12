package com.java.interviewprog.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortInList {
    public static void main(String[] args) {

        List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3);
        //integerList1.stream().distinct().forEach(System.out::println);

        Optional<Integer> reduce = integerList1.stream().reduce(Integer::sum);
        System.out.println(reduce.get());

        Stream<Integer> limit = integerList1.stream().sorted(Comparator.naturalOrder()).limit(1);
        //  limit.forEach(System.out::println);


        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "messi"));
        students.add(new Student(2, "pique"));
        students.add(new Student(30, "busi"));
        students.add(new Student(4, "roberto"));
        // System.out.println("sorting a list based of name in ascending order");
        //students.stream().sorted(Comparator.comparing(student -> student.getName())).forEach(s->System.out.println(s.getName()));

        System.out.println("sorting a list based of name in descending order");
        students.stream().sorted((s1, s2) -> s2.getName().compareTo(s1.getName())).forEach(s -> System.out.println(s.getName()));

        /*System.out.println("sorting a list based of id in ascending order");
        students.stream().sorted(Comparator.comparing(student -> student.getId())).
                collect(Collectors.toList()).forEach(s->System.out.println(s.getId()));

        System.out.println("sorting a list based of id in descending order");
        students.stream().distinct().sorted((s1, s2) -> s2.getId() - (s1.getId())).
                collect(Collectors.toList()).forEach(s->System.out.println(s.getId()));*/


        IntStream intStream = students.stream().mapToInt(student -> student.getId());
        System.out.println(intStream.sum());

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


