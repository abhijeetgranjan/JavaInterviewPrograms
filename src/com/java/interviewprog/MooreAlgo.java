package com.java.interviewprog;

public class MooreAlgo {

    public int findTheMajorityElementInArray(int[] array) {
        int majorityElement = 0, counter = 0;

        for (int a = 0; a < array.length; a++) {

            if (counter == 0) {
                majorityElement = array[a];
            }
            if (array[a] == majorityElement) {
                counter++;
            } else {
                counter--;
            }
        }
        return majorityElement;


    }
}
