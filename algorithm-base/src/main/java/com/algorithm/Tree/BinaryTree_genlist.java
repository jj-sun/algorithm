package com.algorithm.Tree;

public class BinaryTree_genlist {

	public static void main(String[] args) {
		String glist = "A(B(D(^,G),^),C(E,F(H,^)))";
		BinaryTree<String> bitree = createByGenlist(glist);
		System.out.println(bitree.toGenListString());
	}
	
	//�Թ�����ʾ��������һ�Ŷ�������洢�Ķ�����
	private static int i = 0;
	public static BinaryTree<String> createByGenlist(String glist) {
		BinaryTree<String> bitree = new BinaryTree<String>();
		i = 0;
		if(glist.length() > 0) {
			bitree.root = create(glist);
		}
		return bitree;
	}
	public static BinaryNode<String> create(String glist) {
		BinaryNode<String> p = null;
		char ch = glist.charAt(i);
		if(ch >= 'A' && ch <= 'Z' ) {
			p = new BinaryNode<String>(ch+"");
				i++;
				if(glist.charAt(i) == '(') { 
				i++;
				p.left = create(glist);
				i++;
				p.right = create(glist);
				i++;
			}
		}
		if(ch == '^') 
			i++;
		return p;
	}
}
