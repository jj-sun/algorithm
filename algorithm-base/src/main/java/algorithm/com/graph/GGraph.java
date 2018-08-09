package algorithms.com.graph;

public interface GGraph<T> {
	public static final int MAX_WEIGHT=99999;
	int vertexCount();
	T get(int i);
	int getWeigth(int i, int j);
	int insertVertex(T x);
	void insertEdge(int i, int j, int weight);
	void removeVertex(int i);
	void removeEdge(int i, int j);
	int getNextNeighbor(int i, int j);
	void DFSTraverse(int i);
	void BFSTraverse(int i);
}
