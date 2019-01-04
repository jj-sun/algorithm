package com.algorithm.swordOffice;

public class Convert_Solution {
	TreeNode pLastNodeInList;
	public TreeNode Convert(TreeNode pRootOfTree) {
		pLastNodeInList = null;
		if(pRootOfTree == null) {
			return null;
		}
		ConvertNode(pRootOfTree);
		TreeNode pHeadOfList = pLastNodeInList;
		while(pHeadOfList != null && pHeadOfList.left != null) {
			pHeadOfList = pHeadOfList.left;
		}
		return pHeadOfList;
    }

	private void ConvertNode(TreeNode pNode) {
		if(pNode == null) {
			return;
		}
		TreeNode pCurrent = pNode;
		if(pCurrent.left != null) {
			ConvertNode(pCurrent.left);
		}
		pCurrent.left = pLastNodeInList;
		if(pLastNodeInList != null) {
			pLastNodeInList.right = pCurrent;
		}
		pLastNodeInList = pCurrent;
		if(pCurrent.right != null) {
			ConvertNode(pCurrent.right);
		}
		
	}
}
