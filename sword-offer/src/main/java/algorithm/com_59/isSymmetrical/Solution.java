package com.myhexin.com_59.isSymmetrical;

import com.myhexin.com.TreeNode.TreeNode;

public class Solution {
	boolean isSymmetrical(TreeNode pRoot) {
		return isSymmetrical(pRoot,pRoot);
	}

	private boolean isSymmetrical(TreeNode pRoot, TreeNode pRoot2) {
		if(pRoot == null && pRoot2 == null)
			return true;
		if(pRoot == null || pRoot2 == null)
			return false;
		if(pRoot.val != pRoot2.val)
			return false;
		return isSymmetrical(pRoot.left, pRoot2.right)
				&& isSymmetrical(pRoot.right, pRoot2.left);
	}
}
