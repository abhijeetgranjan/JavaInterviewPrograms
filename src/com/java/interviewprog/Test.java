package com.java.interviewprog;

import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) throws ParseException {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        int array[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};


        Integer max = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);

      //  integerList.stream().filter(i->i%2==0).forEach(x-> System.out.println(x));

        String a ="abcdghgm";

        List<String> strings = Arrays.asList( "z",a, "array", "ramesh");

        int len = a.length();

        /*for(int i = len-1 ; i>=0; i--){
            System.out.print(a.charAt(i)+
                    " ");
        }*/


        Stream<String> sorted = strings.stream().sorted(Comparator.reverseOrder());
   //     sorted.forEach(i-> System.out.println(i));


        List<String> collect = strings.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
        collect.forEach(i-> System.out.println(i));


    }
}
