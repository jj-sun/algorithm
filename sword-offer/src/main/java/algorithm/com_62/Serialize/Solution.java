package com.myhexin.com_62.Serialize;

import com.myhexin.com.TreeNode.TreeNode;

public class Solution {
	String stream;
	String Serialize(TreeNode root) {
		if(root == null) 
			return "$,";
		stream += root.val+",";
		Serialize(root.left);
		Serialize(root.right);
		return stream;
	}

	TreeNode Deserialize(String str) {
		int number; 
		return null;
	}
	
	public static void main(String[] args) {
		String a = "jdkfs98798dsfjlsdkjf98sd".replaceAll("[^0-9]", "");
		System.out.println(a);
	}
}
