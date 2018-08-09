package com.myhexin.com_60.Print;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

import com.myhexin.com.TreeNode.TreeNode;

public class Solution {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		LinkedBlockingQueue<TreeNode> que = new LinkedBlockingQueue<TreeNode>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> li = new ArrayList<Integer>();
		if(pRoot == null) return list;
		int nextLevel = 0;
		int toBePrinted = 1;
		try {
			que.put(pRoot);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(!que.isEmpty()) {
			TreeNode node = que.poll();
			li.add(node.val);
			if(node.left != null) {
				try {
					que.put(node.left);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				++nextLevel;
			}
			if(node.right != null) {
				try {
					que.put(node.right);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				++nextLevel;
			}
			--toBePrinted;
			if(toBePrinted == 0) {
				list.add(li);
				li = new ArrayList<Integer>();
				toBePrinted = nextLevel;
				nextLevel = 0;
			}
		}
		return list;
	}
}
