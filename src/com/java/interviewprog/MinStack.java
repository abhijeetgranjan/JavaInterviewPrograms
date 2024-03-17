package com.java.interviewprog;

import java.util.Stack;

public  class MinStack {
    Stack<Integer> stack;
    Stack<Integer> temp ;

    public MinStack() {
        stack = new Stack<>();
        temp = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(temp.empty()){
            temp.push(val);
        }else{
            int cur= temp.peek();
            temp.push(Math.min(val,cur));
        }
    }

    public void pop() {
        stack.pop();
        temp.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return temp.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // return -3
        minStack.pop();
        System.out.println(minStack.top());    // return 0
        System.out.println(minStack.getMin()); // return -2
    }
}
