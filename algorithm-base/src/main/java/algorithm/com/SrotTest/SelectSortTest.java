package algorithms.com.SrotTest;

public class SelectSortTest {
	public static void sort(int[] table) {
		
		if(table == null) return;
		
		for(int i=table.length-1; i>=0; i--) {
			int min = i;    //ѡ������һ����С��
			for(int j=0; j<i; j++) {
				if(table[i] < table[j]) {
					min = j;
					
				}
			}
			if(min != i) {
				int temp = table[i];
				table[i] = table[min];
				table[min] = temp;
			}
		}
		
		for(int i=0; i<table.length; i++) {
			System.out.print(table[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		int[] table = {4,8,2,9,2,6,10,35};
		sort(table);
	}
}
