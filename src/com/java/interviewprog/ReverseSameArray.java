package com.java.interviewprog;

import java.util.Arrays;

public class ReverseSameArray {
    public static void main(String[] args) {

         int [] array = {1,2,3,4,5,6,7,8,9};
         int i = 0,j = array.length-1;

         while (i<j){
             int temp = array[i];
             array[i]= array[j];
             array[j]=temp;
             i++;
             j--;
         }

        Arrays.stream(array).forEach(System.out::println);
    }
}
