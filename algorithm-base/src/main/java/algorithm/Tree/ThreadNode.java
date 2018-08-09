package algorithms.Tree;

public class ThreadNode<T> {
	public T data;
	public ThreadNode<T> left,right;
	public int ltag,rtag;
	public ThreadNode(T data, ThreadNode<T> left, int ltag, ThreadNode<T> right, int rtag) {
		this.data = data;
		this.left = left;
		this.ltag = ltag;
		this.right = right;
		this.rtag = rtag;
	}
	public ThreadNode(T data) {
		this(data,null,0,null,0);
	}
	
	public ThreadNode() {
		this(null, null,0,null,0);
	}
}
