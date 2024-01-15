package com.java.interviewprog;

public class Smallest2ElementsInArray {
    public static void main(String[] args) {
        int [] array = {1,11,15,-5,66,7,81, 9, -5};
        int first,second;

        first=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < first){
                first=array[i];
            }
        }
        System.out.println(first);
        second=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] == first){
               continue;
            }
            else if(array[i]<second){
                second=array[i];
            }
        }

        System.out.println(second);




    }
}
