package algorithms.Tree;

import java.util.Stack;

/**
 * ����һ������������
 * @author dell
 *
 * @param <T>
 */
public class BinaryTree<T> {
	public BinaryNode<T> root;
	public BinaryTree() {
		this.root = null;
	}
	/*
	 * �Ա������������ȸ����й��������
	 * �����ĸ�ֵ��prelist[num]�������������������ĸ��ڵ�
	 */
	int num=0;
	public BinaryTree(T[] prelist) {
		this.root = create(prelist);
	}
	private BinaryNode<T> create(T[] prelist) {
		BinaryNode<T> p = null;
		if(num < prelist.length) {
			T elem = prelist[num];
			num ++;
			if(elem != null) {
				p = new BinaryNode<T>(elem);
				p.left = create(prelist);
				p.right = create(prelist);
			}
		}
		return p;
	}
	public BinaryTree(T[] preList,T[] inList) {
		//inList   postList
		this.root = create(preList,inList,0,0,preList.length);
		//this.root = createTwo(preList,inList,0,inList.length-1,preList.length);
	}
	//��ǰ��������������������������
	private BinaryNode<T> create(T[] preList,T[] inList,int preStart,int inStart,int n) {
		if(n <= 0) return null;
		T elem = preList[preStart];
		BinaryNode<T> p = new BinaryNode<T>(elem);
		int i=0;
		while(i < n && !elem.equals(inList[inStart+i])) 
			i++;
		p.left = create(preList, inList, preStart+1, inStart, i);
		p.right = create(preList, inList, preStart+i+1, inStart+i+1, n-i-1);
		return p;
	}
	//����������ͺ����������������
	private BinaryNode<T> createTwo(T[] inList, T[] postList, int inStart,int postEnd,int n) {
		if(n <= 0) return null;
		T elem = postList[postEnd];
		BinaryNode<T> p = new BinaryNode<T>(elem);
		int i=0;
		while(i < n && !elem.equals(inList[inStart+i])) 
			i++;
		p.left = createTwo(inList,postList,inStart,postEnd+i-n,i);
		p.right = createTwo(inList,postList,inStart+i+1,postEnd-1, n-i-1);
		return p;
	}
	public boolean isEmpty() {
		return this.root == null;
	}
	
	//ǰ�����
	public void preOrder() {
		System.out.println("�������");
		preOrder(root);
		System.out.println();
	}
	private void preOrder(BinaryNode<T> p) {
		if(p != null) {
			System.out.print(p.data+" ");
			preOrder(p.left);
			preOrder(p.right);
		}
	}
	
	//ǰ�����(�ǵݹ�)
	public void preOrderTraverse() {
		System.out.println("ǰ���������(�ǵݹ�)");
		BinaryNode<T> p = this.root;
		Stack<BinaryNode<T>> stack = new Stack<BinaryNode<T>>();
		while(p != null || !stack.isEmpty())
			if(p != null) {
				System.out.print(p.data+" ");
				stack.push(p);
				p = p.left;
			}
			else {
				p = stack.pop();
				p = p.right;
			}
		System.out.println();
	}
	
	//�������
	public void inOrder() {
		System.out.println("�������");
		inOrder(root);
		System.out.println();
	}
	private void inOrder(BinaryNode<T> p) {
		if(p != null) {
			inOrder(p.left);
			System.out.print(p.data + " ");
			inOrder(p.right);
		}
	}
	
	//�������(�ǵݹ�)
	public void inOrderTraverse() {
		System.out.println("�и��������(�ǵݹ�)");
		BinaryNode<T> p = this.root;
		Stack<BinaryNode<T>> stack = new Stack<>();
		while(p != null || !stack.isEmpty()) 
			if(p != null) {
				stack.push(p);
				p = p.left;
			}
			else {
				p = stack.pop();
				System.out.print(p.data+" ");
				p = p.right;
			}
		
		System.out.println();
	}
	
	//�������
	public void postOrder() {
		System.out.println("�������");
		postOrder(root);
		System.out.println();
	}
	private void postOrder(BinaryNode<T> p) {
		if(p != null) {
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p.data + " ");
		}
	}
	
	//��ڵ�ĸ���
	public int count() {
		return count(root);
	}
	private int count(BinaryNode<T> p) {
		if(p == null) return 0;
		return 1+count(p.left) + count(p.right);
	}
	
	//��������ĸ߶�
	public int height() {
		return height(root);
	}
	private int height(BinaryNode<T> p) {
		if(p == null) return 0;
		int h1 = height(p.left);
		int h2 = height(p.right);
		return h1 >= h2 ? h1+1 : h2+1;
	}
	
	//���ҹؼ���
	public BinaryNode<T> search(T key) {
		return search(root,key);
	}
	private BinaryNode<T> search(BinaryNode<T> p, T key) {
		if(p == null || key == null) return null;
		
		if(p.data.equals(key)) return p; 
		BinaryNode<T> find = search(p.left,key);
		if(find == null)
			find = search(p.right,key);
		return find;
	}
	
	//��ĸ�ڵ�
	public BinaryNode<T> getParent(BinaryNode<T> node) {
		if(root == null || node == null || root == node) return null;
		return getParent(root,node);
		
	}
	private BinaryNode<T> getParent(BinaryNode<T> p,BinaryNode<T> node) {
		if(p == null) return null;
		
		if(node == p.left || node == p.right)
			return p;
		BinaryNode<T> find = getParent(p.left,node);
		if(find == null)
			find = getParent(p.right,node);
		return find;
	}
	
	//���أ��ӣ��������Ĺ�����ʾ�ַ���
	public String toGenListString() {
		return "�������Ĺ�����ʾ:" + toGenListString(this.root) + "\n";
	}
	//������p���Ϊ�����Ӷ������Ĺ�����ʾ�ַ������ݹ鷽��
	private String toGenListString(BinaryNode<T> p) {
		if(p == null ) return "^";
		String str = p.data.toString();
		if(p.left != null || p.right != null) 
			str += "(" + toGenListString(p.left)+"," + toGenListString(p.right) +")";
		return str;
	}
	
	//����Ԫ��x��Ϊ����㣬ԭ�������Ϊ������
	public void insertRoot(T x) {
		root = new BinaryNode<T>(x,root,null);
	}
	//����Ԫ��x��Ϊp���ĺ��ӣ���leftChildΪtrue����������Ϊ���ӣ�������Ϊ�Һ���
	//���ز�����
	public BinaryNode<T> insertChild(BinaryNode<T> p, T x, boolean leftChild) {
		if(p==null || x == null) return null;
		
		if(leftChild) {
			p.left = new BinaryNode<T>(x, p.left, null);
			return p.left;
		}
		p.right = new BinaryNode<T>(x, null, p.right);
		return p.right;
	}
	
	//ɾ����������
	public void removeChild(BinaryNode<T> p, boolean leftChild) {
		if(p != null) {
			if(leftChild)
				p.left = null;
			else
				p.right = null;
		}
	}
	
}
