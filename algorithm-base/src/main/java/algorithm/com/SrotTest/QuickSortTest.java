package algorithms.com.SrotTest;

public class QuickSortTest {
	public static void QuickSort(int[] table) {
		if (table == null)
			return;

		sort(table, 0, table.length - 1);

		for (int i = 0; i < table.length; i++) {
			System.out.print(table[i] + " ");
		}
	}

	private static void sort(int[] table, int begin, int end) {
		if (begin >= end)
			return;
		
		int i = begin;
		int j = end;
		int temp = table[i];
		while (i != j) {
			
			while(i < j && table[j] >= temp)
				j--;
			if(i < j)
				table[i++] = table[j];
			
			while(i < j && table[i] <= temp)
				++i;
			if(i<j)
				table[j--] = table[i];
		}
		table[i] = temp;
		sort(table,begin,j-1);
		sort(table,i+1,end);
	}

	public static void main(String[] args) {
		int[] table = { 4, 8, 2, 9, 2, 6, 10, 35 };
		QuickSort(table);
	}
}
