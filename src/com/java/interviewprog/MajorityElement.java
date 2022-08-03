package com.java.interviewprog;

/*
Given an array of size n  find all elements that appear more than " n/2 " times.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 1, 1, 1, 1, 1, 1};
        int[] array1 = {1, 2, 3, 4, 5, 1};
        MooreAlgo mooreAlgo = new MooreAlgo();
        int element = mooreAlgo.findTheMajorityElementInArray(array);
        findTheOccurrencesOfMajorityElement(element,array);

        int element1 = mooreAlgo.findTheMajorityElementInArray(array1);
        findTheOccurrencesOfMajorityElement(element1,array1);
    }

    private static void findTheOccurrencesOfMajorityElement(int element , int []array) {
        int count =0;
        for (int j : array) {
            if (j == element) {
                count++;
            }
        }

        if( count > array.length/2){
            System.out.println(" the number "+ element+" has an occurrences greater than " +array.length/2);
        } else {
            System.out.println( " no element in the array has an occurrences greater than " +array.length/2);
        }
    }
}
