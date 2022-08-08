package com.java.interviewprog;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] array = {30, 45, -15, 11, -1, 65, 21};
        int[] array1 = {20, 45, -15, 21,};

        Set<Integer> mySet = new TreeSet<>();

        for (int i : array) {
            mySet.add(i);
        }
        for (int i : array1) {
            mySet.add(i);
        }

        Iterator iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
