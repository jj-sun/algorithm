package com.myhexin.com_66.hasPath;

public class Solution {
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

		if (matrix == null || rows < 1 || cols < 1 || str == null)
			return false;
		int[] visited = new int[rows * cols];

		int pathLength = 0;
		for (int row = 0; row < rows; ++row) {
			for (int col = 0; col < cols; ++col) {

				if (hasPathCore(matrix, rows, cols, row, col, str, pathLength, visited))
					return true;

			}
		}

		return false;

	}

	private boolean hasPathCore(char[] matrix, int rows, int cols, int row, int col, char[] str, int pathLength,
			int[] visited) {
		if (str.length == pathLength)
			return true;
		boolean hasPath = false;

		if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[pathLength]
				&& visited[row * cols + col] == 0) {

			++pathLength;
			visited[row * cols + col] = 1;
			hasPath = hasPathCore(matrix, rows, cols, row, col - 1, str, pathLength, visited)
					|| hasPathCore(matrix, rows, cols, row - 1, col, str, pathLength, visited)
					|| hasPathCore(matrix, rows, cols, row, col + 1, str, pathLength, visited)
					|| hasPathCore(matrix, rows, cols, row + 1, col, str, pathLength, visited);
			if (!hasPath) {
				--pathLength;
				visited[row * cols + col] = 0;
			}
		}

		return hasPath;

	}
	
	public static void main(String[] args) {
		//"ABCESFCSADEE",3,4,"ABCCED"
		String str = "ABCEHJIGSFCSLOPQADEEMNOEADIDEJFMVCEIFGGS";
		String s = "SGGFIECVAASABCEHJIGQEM";
		boolean f = new Solution().hasPath(str.toCharArray(), 5, 8, s.toCharArray());
		System.out.println(f);
	}
}
