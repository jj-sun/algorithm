package com.algorithm.search;
//���ֲ���
public class BinarySearch {

	public static void main(String[] args) {
//		int[] a = {1,2,3,4,5,6,7,8,9};
//		int key = binarySearch(a, 6);
//		System.out.println(key);
//		LinkedList list =  new LinkedList();
//		Arrays.sort(a);
	}
	
	/**
	 * @param a
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] a,int key) {
		int low = 0;
		int high = a.length-1;
		while(low <= high) {
			int mid = (low+high) >>> 1;
			int midVal = a[mid];
			if(midVal > key) 
				high = mid -1;
			else if(midVal < key)
				low = mid + 1;
			else 
				return mid;
		}
		return -1;
	}
	
	public static int binarySearch1(int[] a,int key) {
		if(a.length == 0) return -1;
		int low = 0;
		int high = a.length-1;
		while(low < high) {
			int mid = (low+high) >>> 1;
			int midVal = a[mid];
			if(midVal < key)
				low = mid + 1;
			else 
				high =  mid;
		}
		if(a[low] == key)
			return low;
		return -1;
	}
}
