package com.java.interviewprog;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackUsingQueue {
    Queue<Integer> ori ;

    public StackUsingQueue() {
        ori = new LinkedList<>();
    }

    public void push(int x) {
        ori.add(x);

    }

    public int pop() {
        Queue<Integer> temp = new LinkedList<>() ;

        while (ori.size()>0){
            temp.add(ori.peek());
            ori.remove();
        }
        while(temp.size()>1){
            ori.add(temp.peek());
            temp.remove();
        }
        int element = temp.peek();
        temp.remove();
        return element;


    }

    public int top() {
         Queue<Integer> temp = new LinkedList<>() ;

        while(ori.size()>0){
            temp.add(ori.peek());
            ori.remove();
        }

        while(temp.size()>1){
            ori.add(temp.peek());
            temp.remove();
        }
        int element = temp.peek();
        ori.add(element);
        temp.remove();
        return element;
    }

    public boolean empty() {
        return ori.size()==0;
    }

    public static void main(String[] args) {
        StackUsingQueue myStack = new StackUsingQueue();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println( myStack.empty()); // return False
    }
}
