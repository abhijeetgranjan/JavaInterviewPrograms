package com.java.interviewprog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Write down different ways to iterate a map
 */


public class MapIteration {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(1, "Patna");
        myHashMap.put(2, "Ranchi");
        myHashMap.put(22, "Delhi");
        myHashMap.put(12, "Varanasi");
        myHashMap.put(24, "Rishikesh");

        //1st approach
        System.out.println("*****************1st approach****************");
        Set<Integer> integers = myHashMap.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            System.out.println(" the key is " + key + " and the value is " + myHashMap.get(key));
        }

        //2nd approach
        System.out.println("********************2nd approach*************");
        for (Map.Entry<Integer, String> entry : myHashMap.entrySet()) {
            System.out.println(" the key is " + entry.getKey() + " and the value is " + entry.getValue());



        }

        //3rd approach
        System.out.println("*******************3rd approach*************");
        myHashMap.forEach((key, value) -> {
            System.out.println(" the key is  "
                    + key + ", and the value is " + value);
        });

        //4th approach
        System.out.println("*******************4th approach *************");
        for (Integer i : myHashMap.keySet()) {
            System.out.println(" the key is " + i + " and the value is " + myHashMap.get(i));
        }
    }
}