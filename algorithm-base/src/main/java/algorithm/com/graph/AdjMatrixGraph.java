package algorithms.com.graph;

import java.util.ArrayList;

public class AdjMatrixGraph<T> {
	protected ArrayList<T> vertexlist;
	protected int[][] adjmatrix;
	private final int MAX_WEIGTH = 99999;

	public AdjMatrixGraph(int size) {
		size = size < 10 ? 10 : size;
		this.vertexlist = new ArrayList<T>(size);
		this.adjmatrix = new int[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				adjmatrix[i][j] = i == j ? 0 : MAX_WEIGTH;
	}

	public AdjMatrixGraph(T[] vertices, Edge[] edges) {
		this(vertices.length);
		if (vertices == null)
			return;

		for (int i = 0; i < vertices.length; i++)
			insertVertex(vertices[i]);

		if (edges != null)
			for (int j = 0; j < edges.length; j++)
				insertEdge(edges[j]);
	}

	public void insertEdge(int i, int j, int weight) {
		int n = this.vertexCount();
		if(i>=0 && i < n && j>= 0 && j < n && i != j && this.adjmatrix[i][j] == MAX_WEIGTH)
			this.adjmatrix[i][j] = weight;
	}

	public void insertEdge(Edge edge) {
		this.insertEdge(edge.start, edge.dest, edge.weight);
	}

	public int insertVertex(T t) {
		this.vertexlist.add(t);
		if (this.vertexCount() > this.adjmatrix.length) {
			int temp[][] = adjmatrix, i, j; // 牛逼

			this.adjmatrix = new int[temp.length * 2][temp.length * 2];

			for (i = 0; i < temp.length; i++) {
				for (j = 0; j < temp.length; j++)
					this.adjmatrix[i][j] = temp[i][j];
				for (j = temp.length; j < temp.length * 2; j++)
					this.adjmatrix[i][j] = MAX_WEIGTH;
			}

			for (i = temp.length; i < temp.length * 2; i++)
				for (j = 0; j < temp.length * 2; j++)
					this.adjmatrix[i][j] = (i == j) ? 0 : MAX_WEIGTH;

		}
		return this.vertexlist.size() - 1;
	}

	public int vertexCount() {
		return this.vertexlist.size();
	}

	public T get(int i) {
		return this.vertexlist.get(i);
	}

	public int getWeight(int i, int j) {
		return this.adjmatrix[i][j];
	}

	@Override
	public String toString() {

		String str = "顶点的集合: " + this.vertexlist.toString() + "\n邻接矩阵： \n";

		int n = this.vertexCount();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++)
				str += this.adjmatrix[i][j] == MAX_WEIGTH ? " ∝" : " " + this.adjmatrix[i][j];
			str += "\n";

		}
		return str;
	}
	
	public void removeEdge(int i, int j) {
		if(i >=0 && i < this.vertexCount() && j >= 0 && j < vertexCount() && i != j)
			this.adjmatrix[i][j] = MAX_WEIGTH;
	}
	public void removeVertex(int i) {
		
		int n =this.vertexCount();
		if(i<0 || i > n)
			return;
		
		this.vertexlist.remove(i);
		
		for(int j=0; j<i; j++)
			for( int k=i+1; k<n; k++)
				this.adjmatrix[j][k-1] = this.adjmatrix[j][k];
		
		for(int j=i+1; j<n; j++)
			for(int k=0; k<i; k++)
				this.adjmatrix[j-1][k] = this.adjmatrix[j][k];
		for(int j=i+1; j<n; j++)
			for(int k=i+1; k<n; k++)
				this.adjmatrix[j-1][k-1] = this.adjmatrix[j][k];
		
	}
}
