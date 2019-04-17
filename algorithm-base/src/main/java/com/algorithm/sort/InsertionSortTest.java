package com.algorithm.sort;

//插入排序
public class InsertionSortTest {

	public static void main(String[] args) {
		int a[] = {2,7,5,8,9,3};
		insertionSort(a);
		insertSort(a);
	}
	
	public static void insertionSort(int[] a) {
		for(int p=1; p<a.length; p++) {
			int tmp = a[p];
			int j = p;
			for( ; j>0 && tmp < a[j-1]; j--) 
				a[j] = a[j-1];
			a[j] = tmp;	
		}
		
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void insertSort(int[] table) {
		
		for(int i=1; i<table.length; i++) {
			int temp = table[i];
			int j;
			for(j=i-1;j>=0 && temp < table[j]; j--)
				table[j+1] = table[j];
			table[j+1] = temp;
			
		}
		
		for(int i =0; i<table.length; i++) {
			System.out.print(table[i] + " ");
		}
		System.out.println();
		
	}
}
