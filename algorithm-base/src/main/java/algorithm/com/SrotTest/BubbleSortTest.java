package algorithms.com.SrotTest;

public class BubbleSortTest {
	public static void sort(int table[]) {
		
		if(table == null) return;
		
		for(int i=1; i<table.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(table[j] > table[j+1]) {
					int temp = table[j];
					table[j] = table[j+1];
					table[j+1] = temp;
				}
				
			}
			
		}
		
		for(int i=0; i<table.length; i++) 
			System.out.print(table[i]+" ");
		
	}
	public static void main(String[] args) {
		int[] table = {4,8,2,9,2,6,10,35};
		sort(table);
	}
}
