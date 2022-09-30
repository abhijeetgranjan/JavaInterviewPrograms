package com.java.interviewprog;

public class SingletonDoubleLock {

    private static volatile SingletonDoubleLock instance;
    private SingletonDoubleLock(){
    }


    public static SingletonDoubleLock getInstance(){
        if(instance ==null){
            synchronized (SingletonDoubleLock.class){
                if(instance == null){
                    instance= new SingletonDoubleLock();
                }
            }
        }
        return instance;
    }
}
