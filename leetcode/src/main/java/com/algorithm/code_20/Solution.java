package com.algorithm.code_20;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            if(!stack.empty() && isPattern(stack.peek(),s.charAt(i))) {
                stack.pop();
            }else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
    public boolean isPattern(char c1,char c2) {
        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()[]{}"));
    }
}
