package com.myhexin.com_39_2.IsBalanced_Solution;

import com.myhexin.com.TreeNode.TreeNode;

public class Solution {
//	public boolean IsBalanced_Solution(TreeNode root) {
//		if(root == null) return true;
//		
//		int left = new com39.TreeDepth.Solution().TreeDepth(root.left);
//		int right = new com39.TreeDepth.Solution().TreeDepth(root.right);
//		int diff = left - right;
//		if(diff > -1 || diff < -1)
//			return false;
//		return IsBalanced_Solution(root.left)&& IsBalanced_Solution(root.right);
//	}
	
	boolean is;
	public boolean IsBalanced_Solution(TreeNode root) {
		boolean is = true;
		IsBalanced(root);
		return is;
	}
	
	public int IsBalanced(TreeNode root) {
		if(root == null)
			return 0;
		int left = IsBalanced(root.left);
		int right = IsBalanced(root.right);
		int diff = left - right;
		if(diff > 1 || diff < -1) {
			is = false;
		}
		return left > right ? left + 1 : right + 1;
	}
}
