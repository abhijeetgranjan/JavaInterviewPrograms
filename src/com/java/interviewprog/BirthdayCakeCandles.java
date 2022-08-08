package com.java.interviewprog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(6, 4, 3, 2, 4);
        int candle = findCandles(candles);
        System.out.println(" the candles are " + candle);
    }

    private static int findCandles(List<Integer> candles) {
        candles.sort(Comparator.reverseOrder());
        HashMap<Integer, Integer> mymap = new HashMap<>();

        candles.stream().forEach(i -> {
            if (mymap.containsKey(i)) {
                mymap.put(i, mymap.get(i) + 1);
            } else {
                mymap.put(i, 1);
            }
        });

        return mymap.get(candles.get(0));


    }
}
