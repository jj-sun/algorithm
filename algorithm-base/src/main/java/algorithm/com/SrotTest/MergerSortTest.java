package algorithms.com.SrotTest;

public class MergerSortTest {

	public static void mergeSort(int [] table) {
		
		if(table == null || table.length < 1) return;
		int[] result = new int[table.length];
		merge(table,result,0,table.length-1);
		
		for(int i=0; i<table.length; i++) 
			System.out.print(table[i]+" ");
	}
	private static void merge(int[] table, int[] result, int start, int end) {
		
		if(start >= end) return;
		
		int len = end - start;
		
		int mid = (len >> 1) + start;
		
		int start1 = start;
		int end1 = mid;
		int start2 = mid + 1;
		int end2 = end;
		
		int k = start;
		
		merge(table,result,start1,end1);
		merge(table,result,start2,end2);
		
		while(start1 <= end1 && start2 <= end2)
			result[k++] = table[start1]>table[start2]?table[start2++]:table[start1++];
			
		while(start1 <= end1)
			result[k++] = table[start1++];
		while(start2 <= end2)
			result[k++] = table[start2++];
		
		for(k=start; k<=end; k++)
			table[k] = result[k];
					
		
	}
	
	public static void main(String[] args) {
		int[] table = { 4, 8, 2, 9, 2, 6, 10, 35 };
		mergeSort(table);
	}

}
