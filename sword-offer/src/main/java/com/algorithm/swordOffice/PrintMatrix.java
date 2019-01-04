package com.algorithm.swordOffice;

import java.util.ArrayList;

public class PrintMatrix {
	 public ArrayList<Integer> printMatrix(int [][] array) {
	        ArrayList<Integer> result = new ArrayList<Integer> ();
	        if(array.length==0) return result;
	        int n = array.length,m = array[0].length;
	        if(m==0) return result;
	        int layers = (Math.min(n,m)-1)/2+1;//����ǲ���
	        for(int i=0;i<layers;i++){
	            for(int k = i;k<m-i;k++) result.add(array[i][k]);//������
	            for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//����������
	            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//������
	            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//����������
	        }
	        return result;       
	    }
	public ArrayList<Integer> printMatrix1(int [][] matrix) {
		if(matrix == null)
			return null;
		int rows = matrix.length;
		int cols = matrix[0].length;
		int start = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(rows > start*2 && cols > start*2) {
			print(matrix,rows,cols,start, list);
			++start;
		}
		return list;
    }

	private void print(int[][] matrix, int rows, int cols, int start, ArrayList<Integer> list) {
		int endX = cols - 1 - start;
		int endY = rows - 1 - start;
		
		//������
		for(int i=start; i<=endY; i++) 
			list.add(matrix[start][i]);
		
		//���ϵ���
		if(start < endY) {
			for(int i = start+1; i<=endY; i++) 
				list.add(matrix[i][endY]);
		}
		
		//���ҵ���
		if(start < endX && start < endY) {
			for(int i=endX-1;  i>=start; i--) 
				list.add(matrix[endY][i]);
		}
		
		//���µ���
		if(start < endX && start < endY - 1) {
			for(int i=endY-1; i>start; i--) 
				list.add(matrix[i][start]);
		}
	}
	
}
