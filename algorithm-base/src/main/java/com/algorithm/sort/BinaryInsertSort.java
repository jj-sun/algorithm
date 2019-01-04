package com.algorithm.sort;

public class BinaryInsertSort {
	
	public static void binaryInsertSort(int[] table) {
		
		for(int i=1; i<table.length; i++) {
			
			int temp = table[i];
			int low = 0;
			int high = i-1;
			while(low <= high) {
				
				int mid = (low+high)/2;
				if(temp < table[mid]) high = mid - 1;
				else
					low = mid + 1;
				
			}
			
			for(int j=i-1; j>=high+1;--j) 
				table[j+1] = table[j];
			table[high+1] = temp;
			
		}
		
	}
	
	public static void printf(int[] table) {
		if(table == null || table.length < 1) return;
		for(int i=0; i<table.length; i++)
			System.out.print(table[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) {
		int[] table = { 4, 8, 2, 9, 2, 6, 10, 35 };
		binaryInsertSort(table);
		printf(table);
	}
	
}