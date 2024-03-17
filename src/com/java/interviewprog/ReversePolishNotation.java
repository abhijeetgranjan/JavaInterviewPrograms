package com.java.interviewprog;

import java.util.Stack;

public class ReversePolishNotation {
    Stack<Integer> stack = new Stack<>();
    public int evaluate(int op1, int op2, String oper){
        if(oper.equals("+")){
            return op1+op2;
        }
        if(oper.equals("-")){
            return op1-op2;
        }
        if(oper.equals("*")){
            return op1*op2;
        }
        return op1/op2;
    }
    public int evalRPN(String[] tokens) {

        for(String s : tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int op2= stack.pop();
                int op1= stack.pop();
                int val=evaluate(op1,op2,s);
                stack.push(val);
            }else{
                int val = Integer.parseInt(s);
                stack.push(val);
            }

        }
        return stack.peek();
    }

    public static void main(String[] args) {
        ReversePolishNotation reverse = new ReversePolishNotation();
        System.out.println(reverse.evalRPN( new String[]{"2","1","+","3","*"}));
        System.out.println(reverse.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
