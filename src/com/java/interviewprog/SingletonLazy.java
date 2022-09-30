package com.java.interviewprog;

//lazy instance
public class SingletonLazy {

    private static SingletonLazy instance;
    private SingletonLazy(){

    }

    public static SingletonLazy getInstance() {
        if(instance==null) {
            synchronized (SingletonLazy.class) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }
}
