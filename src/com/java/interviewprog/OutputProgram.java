package com.java.interviewprog;

public class OutputProgram {
    public static void main(String[] args) {
        display(null); // will call the primitive  so display with string argument called would be output  and error in
        //case display(Integer s) is also there
    }

    static void  display(String s){
        System.out.println("display with string argument called" +s);
    }

    static void  display(int s){
        System.out.println("display with string argument called" +s);
    }

    /* static void  display(Integer s){
        System.out.println("display with Integer argument called");
    }*/

    static void  display(Object s){
        System.out.println("display with object argument called" +s);
    }
}
