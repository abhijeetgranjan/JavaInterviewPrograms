package com.java.tuf.basicRecursion;

public class PrintNTo1UsingRecursion {
    void print(int end, int start) {

        if (end < start) {
            return;
        }
        System.out.println(end);
        end--;
        print(end, start);
    }

    public static void main(String[] args) {
        PrintNTo1UsingRecursion recursion = new PrintNTo1UsingRecursion();
        recursion.print(10, 1);
    }
}
