package com.algorithm.sort;

//����
public class QuickSort {

	public static void main(String[] args) {
		int table[] = {7,4,8,3,1,10,43,657,2,345};
		quickSort(table);
		for(int i=0; i<table.length; i++)
			System.out.print(table[i]+" ");
		System.out.println();
	}
	public static void quickSort(int[] table) {
		quickSort(table,0,table.length-1);
	}
	public static void quickSort(int[] table, int begin, int end) {
		if(begin < end) {
			int i = begin;
			int j = end;
			int vot = table[i];
			while(i != j) {
				while(i < j && vot <= table[j]) 
					j--;
				if(i < j) 
					table[i++] = table[j];
				while(i < j && vot >= table[i])
					i++;
				if(i < j)
					table[j--] = table[i];
			}
			table[i] = vot;
			quickSort(table,begin,j-1);
			quickSort(table,i+1,end);
		}
	}

}
