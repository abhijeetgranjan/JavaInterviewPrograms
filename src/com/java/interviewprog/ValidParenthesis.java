package com.java.interviewprog;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String expression = "([{}])";
        String expression1 = "[()]{}{[()()]()}";
        String expression2 = "[(])";
        String [] array  = new String[]{ expression, expression1, expression2};

        for (String s : array){
            boolean status = checkIfValidParenthesis(s);
            if (status) {
                System.out.println("the expression "+s+ " has valid parenthesis");
            }
            else{
                System.out.println("the expression "+s+ " has not valid parenthesis");
            }
        }

    }

    private static boolean checkIfValidParenthesis(String expression) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if ((c == '(') || (c == '{') || (c == '[')) {
                stack.push(c);
            }

            if (stack.empty()) {
                return false;
            } else {

                if (c == ')') {
                    char ch = stack.pop();
                    if ((ch == '{') || (ch == '[')) {
                        return false;
                    }
                }
                if (c == '}') {
                    char ch = stack.pop();
                    if ((ch == '(') || (ch == '[')) {
                        return false;
                    }
                }
                if (c == ']') {
                    char ch = stack.pop();
                    if ((ch == '{') || (ch == '(')) {
                        return false;
                    }
                }
            }
        }

        return (stack.empty());
    }
}
