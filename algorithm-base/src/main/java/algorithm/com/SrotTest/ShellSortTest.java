package algorithms.com.SrotTest;

public class ShellSortTest {
	
	public static void shellSort(int[] table) {
		
		if(table == null || table.length < 1) return;
		
		for(int delta=table.length>>1; delta > 0; delta /= 2) {
			
			for(int i=delta; i<table.length; i++) {
				
				int temp = table[i];
				int j;
				for(j = i-delta; j>=0&&temp<table[j]; j -= delta)
					table[j+delta] = table[j];
				table[j+delta] = temp;
				
			}
			
			
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
		shellSort(table);
		printf(table);
	}
}
