package com.algorithm.swordOffice;

import java.util.Stack;

public class StackWithMin {
	Stack<Integer> stackData = new Stack<Integer>();
	Stack<Integer> stackMin = new Stack<Integer>();
	public void push(int node) {
        stackData.push(node);
        if(stackMin.size() == 0 || node < stackMin.peek()) 
        	stackMin.push(node);
        else
        	stackMin.push(stackMin.peek());
    }
    
    public void pop() {
        stackData.pop();
        stackMin.pop();
    }
    
    public int top() {
		return stackData.peek();
    }
    
    public int min() {
        return stackMin.peek();
    }
}
