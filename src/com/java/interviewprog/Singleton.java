package com.java.interviewprog;

/**
 * Complete the Singleton class in your editor which contains the following components:
 * <p>
 * A private Singleton non parameterized constructor.
 * A public String instance variable named .
 * Write a static method named getSingleInstance that returns the single instance of the Singleton class.
 * Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.
 **/

public class Singleton {


    private static final Singleton singelton = new Singleton();
    public String str;

    private Singleton() {

    }

    public static Singleton getSingleInstance() {
        return singelton;
    }
}
