package com.java.interviewprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int [] array = { 98, 91,12, 55, 22, 41,31, 45, 13 , 93, 94, 95, 96 };
        List<Integer>[] list = new List[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < array.length; i++) {
            int index = (array[i]/10) %10;
            list[index].add(array[i]);
        }

       // Arrays.stream(list).forEach(System.out::println);

        for (int i = 0; i < list.length; i++) {
            if(list[i]!=null){
                list[i].sort((i1, i2)-> i1.compareTo(i2));
            }
        }

//       Arrays.stream(list).forEach(System.out::println);

        int index =0;
        for (int i = 0; i < list.length; i++) {
            System.out.println(" at position " +i +" , the size of elements are  " + list[i].size());
            for (int j = 0 , size = list[i].size(); j < size; j++) {
                array[index++] = list[i].get(j);
            }
        }

        Arrays.stream(array).forEach(System.out::println);

    }


}
