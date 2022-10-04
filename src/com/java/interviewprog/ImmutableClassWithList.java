package com.java.interviewprog;

import java.util.ArrayList;
import java.util.List;


public final class ImmutableClassWithList {

    private final int age;
    private final String name;
    private final List<String> streams;


    public ImmutableClassWithList(int age, String name, List<String> streams) {
        this.age = age;
        this.name = name;
        List<String> temp = new ArrayList<>();
        for (String s : streams) {
            temp.add(s);

        }
        this.streams = temp;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getStreams() {
        List<String> temp = new ArrayList<>();
        for (String s : streams) {
            temp.add(s);
        }
        return temp;
    }

}

class ImmutabilityListDemo {

    public static void main(String[] args) {


        List<String> streams = new ArrayList<>();
        streams.add("db");
        streams.add("dsa");
        ImmutableClassWithList list = new ImmutableClassWithList(23, "immutable", streams);
        list.getStreams().stream().forEach(System.out::println);


        list.getStreams().add("os");
        list.getStreams().add("toc");
        list.getStreams().stream().forEach(System.out::println);

    }
}
