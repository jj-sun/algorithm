package algorithms.com.sort.Test;

public class QuickSort {
	
	
	public static void quickSort(int[] table) {
		
		if(table == null || table.length < 1) return;
		
		quickSort(table,0,table.length-1);
		
		for(int i=0; i<table.length; i++)
			System.out.print(table[i] + " ");
		
	}

	private static void quickSort(int[] table, int start, int end) {
		if(start < end) {
			
			int i = start;
			int j = end;
			int temp = table[i];
			
			while(i != j) {
				
				while(i < j && temp < table[j])
					--j;
				if(i < j)
					table[i++] = table[j];
				
				while(i < j && temp > table[i])
					++i;
				if(i < j)
					table[j--] = table[i];
				
				
			}
			table[i] = temp;
			quickSort(table, start, j-1);
			quickSort(table, i+1, end);
			
		}
	}
	public static void main(String[] args) {
		int[] table = {4,6,9,1,56,34,53,14,5};
		quickSort(table);
	}
}
