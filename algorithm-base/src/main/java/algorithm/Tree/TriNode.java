package algorithms.Tree;
/**
 * ��������������������
 * @author sun
 *
 * @param <T>
 */
public class TriNode<T> {
	public T data;
	public TriNode<T> parent,left,right;
	public int level;
	public TriNode(T data, TriNode<T> parent, TriNode<T> left, TriNode<T> right, int level) {
		this.data = data;
		this.parent = parent;
		this.left = left;
		this.right = right;
		this.level = level;
	}
	public TriNode(T data) {
		this(data,null,null,null,0);
	}
	public TriNode() {}
}
