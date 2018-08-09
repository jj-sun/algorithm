package algorithms.Tree;

public class CompleteBinaryTree<T> extends BinaryTree<T> {
	
	public CompleteBinaryTree() {super();}
	
	//����ȫ�������Ĳ�����й�����ȫ��������levellist�ƶ��������
	public CompleteBinaryTree(T[] levellist) {
		this.root = create(levellist,0);
	}
	private BinaryNode<T> create(T[] levelist,int i) {
		BinaryNode<T> p = null;
		if(i<levelist.length) {
			p = new BinaryNode<T>(levelist[i]);
			p.left = create(levelist,2*i+1);
			p.right = create(levelist,2*i+2);
		}
		return p;
	}

	
	public static void main(String[] args) {
		String[] levellist = {"A","B","C","D","E","F","G","H"};
		CompleteBinaryTree<String> cbitree = new CompleteBinaryTree<>(levellist);
		cbitree.inOrderTraverse();
		cbitree.inOrder();
		cbitree.preOrderTraverse();
		cbitree.preOrder();
	}
}
