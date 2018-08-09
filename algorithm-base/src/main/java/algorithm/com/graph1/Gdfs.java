package algorithms.com.graph1;

public class Gdfs {
	private int n;       //图的节点个数
	private int mat[][];  //以二位数组存储图的邻接矩阵
	private int visited[];  //访问标记数组
	
	public Gdfs(int m1[][]) {
		n = m1.length;
		mat = new int[n][n];
		System.arraycopy(m1, 0, mat, 0, n);
		this.visited = new int[n];
	}
	
	public Gdfs() {
	}
	
	public void depthFirstSearch() {
		
		for(int k=1; k<=n; k++) {
			dfs(k);
			System.out.println();
			unvisited();
		}
		
	}

	private void unvisited() {
		for(int i=0; i<visited.length; i++)
			visited[i] = 0;
	}

	private void dfs(int k) {
		
		int i,j=0;
		
		System.out.print("v" + k + "->");
		
		i = k-1;
		
		visited[i] = 1;
		
		while(j < n) {
			if(mat[i][j] == 1 && visited[j] == 0)
				dfs(j+1);
			else
				j++;
		}
		
		
		
	}
	public static void main(String[] args) {
		int mat[][] = {
			//        1 2 3 4
				/*1*/{0,1,0,1},
				/*2*/{1,0,1,1},
				/*3*/{0,1,0,1},
				/*4*/{1,1,1,0}
		};
		
		new Gdfs(mat).depthFirstSearch();
		
		
		
		
	}
}
