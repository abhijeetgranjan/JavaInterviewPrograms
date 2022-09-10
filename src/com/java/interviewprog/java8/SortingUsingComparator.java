package com.java.interviewprog.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.reverseOrder;

public class SortingUsingComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "amrit"));
        students.add(new Student(22, "shiva"));
        students.add(new Student(3, "ramit"));
        students.add(new Student(4, "mahesh"));

        System.out.println("sorting by id");
        Collections.sort(students, (i1, i2) -> (i1.getId() > i2.getId()) ? 1 : (i1.getId() < i2.getId()) ? -1 : 0);
        students.stream().forEach(student -> {
            System.out.println(student.getName() + " " + student.getId());
        });

        System.out.println();
        System.out.println("sorting by name");
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        students.stream().forEach(student -> {
            System.out.println(student.getName() + " " + student.getId());
        });


    }
}
