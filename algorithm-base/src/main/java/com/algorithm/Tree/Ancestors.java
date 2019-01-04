package com.algorithm.Tree;

public class Ancestors {

	public static void main(String[] args) {
		String[] prelist = {"A","B","D",null,"G",null,null,null,"C","E",null,null,"F","H"};
		BinaryTree<String> bitree = new BinaryTree<String>(prelist);
		bitree.preOrder();
		bitree.inOrder();
		bitree.postOrder();
		System.out.println("���Ľڵ���: " + bitree.count());
		System.out.println("���ĸ߶�: " + bitree.height());
		BinaryNode<String> find = bitree.search("H");
		if(find == null) 
			System.out.println("û�д˽ڵ�");
		else {
			BinaryNode<String> parent = bitree.getParent(find);
			System.out.print(find.data+"�����Ƚڵ��� ");
			while(parent != null) {
				System.out.print(parent.data + " ");
				parent = bitree.getParent(parent);
			}
			System.out.println();
		}
	}

}
