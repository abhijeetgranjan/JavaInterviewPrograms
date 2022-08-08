package com.java.interviewprog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElementsInListUsingJava8{
    public static void main(String[] args) {
        List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //First Approach
        int sum= mylist.stream().mapToInt(a -> a).sum();
        System.out.println(" the sum is "+sum);

        //Second Approach
        Integer collect = mylist.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(" the sum is "+collect);


    }
}
