package com.myhexin.com_67.movingCount;

public class Solution {
	public int movingCount(int threshold, int rows, int cols) {
		boolean[] visited = new boolean[rows*cols];
		
		int count = movingCountCore(threshold,rows,cols,0,0,visited);
		return count;
	}

	private int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
		int count = 0;
		if(check(threshold,rows,cols,row,col,visited)) {
			
			visited[row*cols + col] = true;
			count = 1 + movingCountCore(threshold, rows, cols, row-1, col, visited)
					  + movingCountCore(threshold, rows, cols, row, col-1, visited)
					  + movingCountCore(threshold, rows, cols, row+1, col, visited)
					  + movingCountCore(threshold, rows, cols, row, col+1, visited);
			
		}
		return count;
	}

	private boolean check(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
		if(row >= 0 && row < rows && col >= 0 && col < cols && getDigitSum(row) + getDigitSum(col) <= threshold
				&& !visited[row*cols+col])
			return true;
		return false;
	}

	private int getDigitSum(int row) {
		int sum = 0;
		while(row > 0) {
			sum += row % 10;
			row /= 10;
		}
		return sum;
	}
}



