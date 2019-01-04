package com.algorithm.Tree;

public class TriBinaryTree<T> {
	public TriNode<T> root;
	public TriBinaryTree() {this.root = null;}
	public TriBinaryTree(T[] prelist) {
		this.root = create(prelist,1,null);
	}
	private int i = 0;
	private TriNode<T> create(T[] prelist, int level, TriNode<T> parent) {
		TriNode<T> p = null;
		if(i < prelist.length) {
			T elem = prelist[i++];
			if(elem != null) {
				p = new TriNode<T>(elem, parent, null, null, level);
				p.left = create(prelist,level+1,p);
				p.right = create(prelist,level+1,p);
			}
		}
		return p;
	}
	
	//���ø߶�
	public void setLevel(TriNode<T> p, int level) {
		if(p != null) {
			p.level = level;
			setLevel(p.left,level+1);
			setLevel(p.right,level+1);
		}
	}
	
	//��������
	public void insertRoot(T x) {
		this.root = new TriNode<T>(x, null, this.root, null, 1);
		if(this.root.left != null) 
			this.root.left.parent = this.root;
		setLevel(this.root.left, 2);
		
	}
	
	//������
	public TriNode<T> insertChild(TriNode<T> p, T x,boolean leftChild) {
		if(p == null || x == null) 
			return null;
		TriNode<T> q = null;
		if(leftChild) {
			q = new TriNode<T>(x, p, p.left, null, p.level+1);
			if(p.left != null) 
				p.left.parent = q;
			p.left = q;
		}else { 
			q = new TriNode<T>(x, p, null, p.right, p.level+1);
			if(p.right != null)
				p.right.parent = q;
			p.right = q;
		}
		setLevel(q, p.level+1);
		return q;
	}
	
	//�����������ֱ��
	private TriNode<T> deep;
	public void printDiameter() {
		deep = this.root;
		String path = ")";
		deepest(this.root);
		while(deep != this.root) {
			path = ","+deep.data.toString()+path;
			deep = deep.parent;
		}
		if(this.root != null) {
			path = deep.data.toString() + path;
		}
		System.out.println("��������ֱ�� ���Ӹ���㵽����Ҷ�ӽ�㣩�� (" + path);
	}
	
	private void deepest(TriNode<T> p) {
		if(p != null) {
			if(p.level > deep.level)
				deep = p;
			deepest(p.left);
			deepest(p.right);
		}
	}
	
}
