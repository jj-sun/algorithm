package com.myhexin.swordOffice;

public class BinaryTree {

	public static void main(String[] args) {
//		int[] pre = {1,2,4,7,3,5,6,8};
//		int[] in = {4,7,2,1,5,3,8,6};
//		TreeNode root = reConstructBinaryTree(pre, in);
//		preOrder(root);
		
	}

	public  TreeNode reConstructBinaryTree(int[] pre, int[] in) {
		TreeNode root = create(pre,in,0,0,pre.length);
		return root;
	}
	
	private  TreeNode create(int[] pre, int[] in, int preStart, int inStart,int n) {
		if(n <= 0) return null;
		
		int elem = pre[preStart];
		TreeNode p = new TreeNode(elem);
		int i=0;
		while(i < n && elem != in[inStart+i])
			i++;
		p.left = create(pre,in,preStart+1,inStart,i);
		p.right = create(pre,in,preStart+i+1,inStart+i+1,n-i-1);
		
		return p;
	}
	
	public static void preOrder(TreeNode root) {
		if(root != null) {
			System.out.print(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
//	private static TreeNode create(int[] pre, int[] in,int preStart,int inStart,int n) {
//		
//		if(n < 0) {
//			return null;
//		}
//		int elem = pre[preStart];
//		TreeNode p = new TreeNode(elem);
//		int i=0;
//		while(i < n && elem != in[inStart+i]) {
//			i++;
//		}
//		p.left = create(pre,in,preStart+1,inStart,i);
//		p.right = create(pre,in,preStart+i+1,inStart+i+1,n-1-i);
//		return p;
//	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
