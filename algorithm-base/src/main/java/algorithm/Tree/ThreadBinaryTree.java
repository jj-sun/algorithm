package algorithms.Tree;

public class ThreadBinaryTree<T> {
	public ThreadNode<T> root;
	
	public ThreadBinaryTree() { this.root = null;}
	
	public boolean isEmpty() { return root == null;}
}
