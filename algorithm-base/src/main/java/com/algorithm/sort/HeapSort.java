package com.algorithm.sort;

public class HeapSort {
	public static void createHeap(int[] table) {
		
		for(int i=table.length>>1; i>=0; --i) 
			heapAdjust(table,i,table.length-1);
		
	}
	
	/**
	 * ɸѡ��������
	 * @param table
	 * @param s
	 * @param m
	 */
	public static void heapAdjust(int[] table,int s, int m) {
		
		int temp = table[s];
		for(int j=2*s; j<=m; j*=2) {
			
			if(j < m && table[j] < table[j+1]) ++j;
			
			if(temp >= table[j]) break;
			
			table[s] = table[j];
			s = j;
			
		}
		table[s] = temp;
		
	}
	
	public static void heapSort(int[] table) {
		
		createHeap(table);
		
		for(int i=table.length-1; i>0; --i) {
			
			int x = table[0];
			table[0] = table[i];
			table[i] = x;
			heapAdjust(table,0,i-1);
			
		}
		
	}
	
	public static void printf(int[] table) {
		if(table == null || table.length < 1) return;
		for(int i=0; i<table.length; i++)
			System.out.print(table[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] table = { 49, 38, 65, 97, 76, 13, 27, 49 };
		heapSort(table);
		printf(table);
	}
}
