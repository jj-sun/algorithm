package com.myhexin.swordOffice;

public class HasSubtree {
	public boolean hasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1 != null && root2 != null) {
        	if(root1.val == root2.val) 
        		result = DoesTree1HasTree2(root1,root2);
        	if(!result)
        		result = hasSubtree(root1.left, root2);
        	if(!result)
        		result = hasSubtree(root1.right, root2);
        }
        return result;
    }

	public boolean DoesTree1HasTree2(TreeNode root1, TreeNode root2) {
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.val != root2.val)
			return false;
		return DoesTree1HasTree2(root1.left, root2.left) && DoesTree1HasTree2(root1.right, root2.right);
	}
}
/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/