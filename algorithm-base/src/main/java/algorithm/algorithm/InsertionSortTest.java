package algorithms.algorithm;

public class InsertionSortTest {

	public static void main(String[] args) {
		int a[] = {2,7,5,8,9,3};
		insertionSort(a);
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
	}
}
