package com.java.interviewprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Immutable classes are the ones where once the objects are created, it can't be modified, or it's content can't be changed

 class should be final
 data members must be private
 data members must be final
 there shouldn't be any setter only getter
 setting should be done using parametrized constructor
 deep copy of the object should be performed in getter

 */


public final class ImmutableClassDemo {
    private final int age;
    private final String name;
    private final HashMap<Integer, String> employee ;

    public ImmutableClassDemo(int age, String name, HashMap<Integer, String> employee) {
        this.age = age;
        this.name = name;

        HashMap<Integer, String> temp = new HashMap<>();
        for(Map.Entry<Integer, String> entry : employee.entrySet()){
            temp.put(entry.getKey(),entry.getValue());
        }

        this.employee = temp;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public HashMap<Integer, String> getEmployee() {
        HashMap<Integer, String> temp = new HashMap<>();
        for(Map.Entry<Integer, String> entry : employee.entrySet()){
            temp.put(entry.getKey(),entry.getValue());
        }
        return temp;
    }
}

class Demo{
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "first");
        map.put(2, "second");
        ImmutableClassDemo abhi = new ImmutableClassDemo(1, "abhi", map);


        System.out.println(abhi.getAge());
        System.out.println(abhi.getName());
        System.out.println(abhi.getEmployee());

        abhi.getEmployee().put(3,"three");
        System.out.println(abhi.getEmployee());


    }
}
