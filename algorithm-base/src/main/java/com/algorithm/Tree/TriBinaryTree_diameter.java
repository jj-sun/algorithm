package com.algorithm.Tree;

public class TriBinaryTree_diameter {

	public static void main(String[] args) {
		String[] prelist = {"A","B","D",null,"G",null,null,null,"C","E",null,null,"F","H"};
		TriBinaryTree<String> bitree = new TriBinaryTree<>(prelist);
		bitree.printDiameter();
	}

}