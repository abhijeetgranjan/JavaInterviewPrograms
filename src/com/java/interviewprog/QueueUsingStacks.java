package com.java.interviewprog;

import java.util.Stack;

public class QueueUsingStacks {
    Stack<Integer> ori;

    public QueueUsingStacks() {
        ori = new Stack<>();
    }

    public void push(int x) {
        ori.push(x);
    }

    public int pop() {
        Stack<Integer>temp = new Stack<>();

        while(ori.size()>0){
            temp.push(ori.peek());
            ori.pop();
        }

        int element = temp.peek();
        temp.pop();


        while(temp.size()>0){
            ori.push(temp.peek());
            temp.pop();
        }
        return element;
    }

    public int peek() {
        Stack<Integer>temp = new Stack<Integer>();

        while(ori.size()>0){
            temp.push(ori.peek());
            ori.pop();
        }

        int element = temp.peek();

        while(temp.size()>0){
            ori.push(temp.peek());
            temp.pop();
        }
        return element;
    }

    public boolean empty() {
        return ori.size()==0;
    }

    public static void main(String[] args) {
        QueueUsingStacks queueUsingStacks = new QueueUsingStacks();
        queueUsingStacks.push(1); // queue is: [1]
        queueUsingStacks.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(queueUsingStacks.peek()); // return 1
        System.out.println( queueUsingStacks.pop()); // return 1, queue is [2]
        System.out.println(queueUsingStacks.empty()); // return false
    }
}
