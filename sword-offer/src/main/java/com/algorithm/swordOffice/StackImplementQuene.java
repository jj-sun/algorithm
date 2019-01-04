package com.algorithm.swordOffice;

import java.util.Stack;

public class StackImplementQuene {

	
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	for(int i=stack1.size()-1; i>=0; i--) {
    		stack2.push(stack1.get(i));
    	}
    	int num = stack2.pop();
    	for(int i=0; i<stack1.size(); i++) {
    		if(num == stack1.get(i)) { 
    			stack1.remove(i);
    			break;
    		}
    	}
    	return num;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	StackImplementQuene s = new StackImplementQuene();
    	for(int i=0; i<5; i++) {
    		s.push(i);
    	}
    	
    	System.out.println(s.pop());
    	System.out.println(s.pop());
    	System.out.println(s.pop());
    	
	}
}
