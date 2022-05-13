package com.java.interviewprog;

import java.util.Arrays;
import java.util.List;

/**
 * WAP to find the missing number which from a series of continuous number
 * for example {1,2,3,4,6,7,8,9} is a series from which 5 is missing
 */

public class MissingNumberInContinuousSeries {
    public static void main(String[] args) {
        List<Integer> series = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13);
        missingNumberInSeries(series);

    }

    static void missingNumberInSeries(List<Integer> series) {
        int size = series.size();
        int sum = series.stream().mapToInt(a -> a).sum();
        int requiredSum = ((size + 1) * (size + 2)) / 2;
        int missingNumber = requiredSum - sum;
        System.out.println(" The missing number in series is " + missingNumber);
    }
}
