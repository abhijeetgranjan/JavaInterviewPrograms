package com.java.interviewprog.java8;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "abhijeet"));
        students.add(new Student(2, "ranjan"));

        Map<Integer, String> hashmap = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));

        for (Map.Entry<Integer, String> integerStringMap : hashmap.entrySet()) {
            System.out.println(" the id is " + integerStringMap.getKey() + " and the value is " + integerStringMap.getValue());
        }
    }
}


class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
