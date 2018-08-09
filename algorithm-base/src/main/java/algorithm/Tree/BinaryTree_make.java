package algorithms.Tree;

public class BinaryTree_make {
	
	public static BinaryTree<String> make() {
		BinaryTree<String> bitree = new BinaryTree<String>();
		BinaryNode<String> child_f,child_d,child_b,child_c;
		child_d = new BinaryNode<String>("D",null,new BinaryNode<String>("G"));
		child_b = new BinaryNode<String>("B", child_d, null);
		child_f = new BinaryNode<String>("F", new BinaryNode<String>("H"), null);
		child_c = new BinaryNode<String>("C", new BinaryNode<String>("E"), child_f);
		bitree.root = new BinaryNode<String>("A", child_b, child_c);
		return bitree;
	}
	public static void main(String[] args) {
		//BinaryTree<String> bitree = m,ake();
		String[] preList = {"A","B","D","G","C","E","F","H"};
		String[] inList = {"D","G","B","A","E","C","H","F"};
		String[] postList = {"G","D","B","E","H","F","C","A"};
		BinaryTree<String> bitree = new BinaryTree<String>(inList, postList);
		bitree.preOrder();
		bitree.inOrder();
		bitree.postOrder();
		//System.out.println(bitree.count());
		System.out.println(bitree.search("D").data);
	}
}
