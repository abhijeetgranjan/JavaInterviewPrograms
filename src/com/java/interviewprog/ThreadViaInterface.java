package com.java.interviewprog;

public class ThreadViaInterface implements Runnable{
    @Override
    public void run() {
        System.out.println(" ThreadViaInterface run method is called");
    }
}

class TVI {
    public static void main(String[] args) {

        ThreadViaInterface threadViaInterface = new ThreadViaInterface();
        Thread t = new Thread(threadViaInterface);
        t.start();
    }
}
