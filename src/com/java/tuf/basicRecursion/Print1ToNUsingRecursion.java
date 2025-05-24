package com.java.tuf.basicRecursion;

//Time complexity : O(n)
public class Print1ToNUsingRecursion {

    void print(int start, int end) {

        if (start > end) {
            return;
        }
        System.out.println(start);
        start++;
        print(start, end);
    }

    public static void main(String[] args) {
        Print1ToNUsingRecursion recursion = new Print1ToNUsingRecursion();
        recursion.print(1,10);
    }
}
