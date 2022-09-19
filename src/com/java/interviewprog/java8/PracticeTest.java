package com.java.interviewprog.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeTest {
    public static void main(String[] args) {

        int [] array = { 98, 91,12, 55, 22, 41, 31, 45, 13  };
        List<Integer> [] list = new List[10];



        for (int i = 0; i < array.length; i++) {
            int i1 = (array[i] / 10) % 10;
            if(list[i1] ==null){
                list[i1] = new ArrayList<>();
            }
            list[i1].add(array[i]);
        }

        for (int i = 0; i < list.length ; i++) {
            if (list[i] != null) {
                list[i].sort((i1, i2) -> i1.compareTo(i2));
            }
        }

        int index =0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0 ; list[i]!=null && j < list[i].size(); j++) {
                array[index++] =list[i].get(j);
            }
        }

        Arrays.stream(array).forEach(System.out::println);




    }

}

























