package com.java.interviewprog.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {

        List<List<String>> names = new ArrayList<>();

        List<String> fname = new ArrayList<>();
        List<String> lname = new ArrayList<>();

        fname.add("abhi");
        fname.add("jeet");

        lname.add("ran");
        lname.add("jan");

        names.add(fname);
        names.add(lname);



        names.stream().flatMap(i->i.stream()).collect(Collectors.toList()).forEach(System.out::println);
        names.stream().flatMap(i -> i.stream().map(j->j.toUpperCase())).forEach(System.out::println);


    }
}
