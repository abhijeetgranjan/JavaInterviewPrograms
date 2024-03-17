package com.java.interviewprog;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if ((c == ('(')) || (c == ('{')) || (c == ('['))) {
                stack.push(c);
            } else {
                if(stack.empty()){
                    return false;
                }
                if ((c == (')'))) {
                    char d = stack.pop();
                    if (d != ('(')) return false;
                } else if ((c == ('}'))) {
                    char d = stack.pop();
                    if (d != ('{')) return false;
                } else if ((c == (']'))) {
                    char d = stack.pop();
                    if (d != ('[')) return false;
                }
            }
        }
        return stack.empty();

    }

    public static void main(String[] args) {
        ValidParentheses valid = new
                ValidParentheses();
        System.out.println(valid.isValid("()"));
        System.out.println(valid.isValid("()[]{}"));
        System.out.println(valid.isValid("(]"));
    }
}
