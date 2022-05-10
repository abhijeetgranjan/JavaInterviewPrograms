package com.java.interviewprog;

public class VarargsImplementation {

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        print(myArray);
        print(0);
        print();

    }

    static void print(int... a) {
        System.out.println("-------------------------");
        System.out.println(" number of arguments " + a.length + " and the values are");
        for (int i : a) {
            System.out.print(" " + i);
        }
        System.out.println(" ");


    }
}
