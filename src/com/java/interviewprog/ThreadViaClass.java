package com.java.interviewprog;

public class ThreadViaClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" the current value is "  +i);
        }
    }
}

class Print {
    public static void main(String[] args) {
        ThreadViaClass threadViaClass = new ThreadViaClass();
        threadViaClass.start();

    }
}
