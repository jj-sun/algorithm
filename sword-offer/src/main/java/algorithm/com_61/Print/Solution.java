package com.myhexin.com_61.Print;

import java.util.ArrayList;
import java.util.Stack;

import com.myhexin.com.TreeNode.TreeNode;

public class Solution {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> li = new ArrayList<Integer>();
		if(pRoot == null) return list;
		int current = 0;
		int next = 1;
		Stack<TreeNode>[] stack = new Stack[2];
		stack[0] = new Stack<TreeNode>();
		stack[1] = new Stack<TreeNode>();
		stack[current].push(pRoot);
		while(!stack[0].isEmpty() || !stack[1].isEmpty()) {
			TreeNode pNode = stack[current].pop();
			li.add(pNode.val);
			if(current == 0) {
				if(pNode.left != null) 
					stack[next].push(pNode.left);
				if(pNode.right != null)
					stack[next].push(pNode.right);
			}else {
				if(pNode.right != null)
					stack[next].push(pNode.right);
				if(pNode.left != null)
					stack[next].push(pNode.left);
			}
			
			if(stack[current].isEmpty()) {
				list.add(li);
				li = new ArrayList<Integer>();
				current = 1 - current;
				next = 1 - next;
			}
		}
		
		return list;
	}
}
