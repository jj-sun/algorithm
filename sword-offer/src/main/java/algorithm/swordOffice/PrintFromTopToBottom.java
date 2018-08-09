package com.myhexin.swordOffice;

import java.util.ArrayList;

public class PrintFromTopToBottom {
	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<TreeNode> list1 = new ArrayList<TreeNode>();
        if(root == null) return list;
        list1.add(root);
        while(!list1.isEmpty()) {
        	TreeNode p = list1.get(0);
        	list.add(p.val);
        	list1.remove(0);
        	if(p.left != null)
        		list1.add(p.left);
        	if(p.right != null)
        		list1.add(p.right);
        }
        return list;
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