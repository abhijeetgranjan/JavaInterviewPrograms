package com.java.interviewprog;

public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager(){

    }

    public static SingletonEager getIntance() {
        return instance;
    }
}
