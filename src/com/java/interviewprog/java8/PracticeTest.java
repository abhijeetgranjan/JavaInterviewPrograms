package com.java.interviewprog.java8;

public class PracticeTest extends Thread {

    public void run(){
        System.out.println("child thread started");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void print(){
        System.out.println("print called");
    }


    public void demo() {
        System.out.println("over ridden demo");
    }


    public static void main(String[] args) {
        /*System.out.println(currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        PracticeTest t = new PracticeTest();
        t.print();
        System.out.println(t.getName());
        System.out.println(activeCount());*/

        PracticeTest practiceTest = new PracticeTest();
        practiceTest.demo();
        Interf.staticMethod();

    }
}


interface Interf{

    public default void demo(){
        System.out.println(" default method of interface");
    }

    static void staticMethod(){
        System.out.println(" static method of interface");
    }


}
