package com.java.interviewprog;

import java.io.Serializable;

public class SingletonStopBreak implements Serializable, Cloneable {

    private static SingletonStopBreak instance = new SingletonStopBreak();

    //prevent from reflection
    private SingletonStopBreak() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }


    //stop breaking from serialization
    public Object readResolve() {
        return instance;
    }


    //stop breaking from cloning
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
