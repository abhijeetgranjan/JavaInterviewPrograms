package com.java.interviewprog.java8;
/*
Increase the id of students by 5 whose name starts with s

 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModifyValuesUsingStream {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "amrit"));
        students.add(new Student(22, "shiva"));
        students.add(new Student(3, "ramit"));
        students.add(new Student(4, "mahesh"));
        students.add(new Student(4, "sam"));


        List<Student> s = students.stream().filter(student -> student.getName().startsWith("s")).
                map(student -> new Student(student.getId() + 5, student.getName())).collect(Collectors.toList());

        s.forEach(System.out::println);


    }
}
