package com.algorithm.swordOffice;

import java.util.ArrayList;

//��˳ʱ�����һ����λ����
public class ClockwiseMatrix {

	public static void main(String[] args) {
		//int mat[][] = {{1,2},{3,4}};
		//int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		//int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//int mat[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		//int [][] mat = {{60,26,6,67,90,47},{32,15,31,11,65,1}};
		//int[][] mat = {{98,30,17},{38,96,90,},{17,0,50},{44,12,67},{12,79,43},{43,63,40},{19,93,48}};
		int mat[][] = new int[11][12];
		int k = 1;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[0].length; j++) {
				mat[i][j] = k;
				k++;
			}
		}
		get(mat);
		
	}
	public static ArrayList<Integer> get(int [][] mat) {
		String s = search(mat,0,0,mat.length,mat[0].length);
		String [] str = s.split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<str.length-1; i++) {
			list.add(Integer.parseInt(str[i]));
		}
		return list;
	}
	public static String search(int mat[][],int x,int y,int n,int m) {
		
		if(x > n || y > m) {
			return null;
		}
		String s = "";
		//��R
		for(int i=y; i <= m; i++) {
			s = s + mat[x][i] + " ";
		}
		//��D
		for(int i=x+1; i <= n; i++) {
			s += mat[i][m] + " ";
		}
		
		//��L
		for(int i=m-1; i >= y; i--) {
			if(n == x)
				break;
			s += mat[n][i] + " ";
		}
		//��U
		for(int i=n-1; i > x; i--) {
			if(y == m) {
				break;
			}
			s += mat[i][y] + " ";
		}
		return s + search(mat,x+1,y+1,n-1,m-1);
	}
}
