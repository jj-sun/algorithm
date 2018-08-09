package com.myhexin.com_63.KthNode;

import com.myhexin.com.TreeNode.TreeNode;

public class Solution {
	int num;
	TreeNode KthNode(TreeNode pRoot, int k) {
		if(pRoot == null || k == 0)
			return null;
		num = k;
		return KthNodeCore(pRoot);
	}
	private TreeNode KthNodeCore(TreeNode pRoot) {
		TreeNode node = null;
		if(pRoot.left != null) 
			node = KthNodeCore(pRoot.left);
		if(node == null) {
			if(num == 1)
				node = pRoot;
			num--;
		}
		
		if(node ==null && pRoot.right != null)
			node = KthNodeCore(pRoot.right);
		return node;
	}
}
