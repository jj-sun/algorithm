package com.algorithm.sort;
/**
 * 归并排序
 * @author sun
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int a[] = {2,7,5,8,9,3};
		merge_sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	/**
	 * 归并排序
	 * @param attr
	 */
	public static void merge_sort(int[] attr) {
		int len = attr.length;
		int[] result = new int[len];
		merge_sort(attr,result,0,len-1);
	}
	/**
	 * 归并排序
	 * @param attr
	 * @param result
	 * @param start
	 * @param end
	 */
	private static void merge_sort(int[] attr, int[] result, int start, int end) {
		if(start >= end) 
			return;
		int len = end-start;
		int start1 = start;
		int mid = (len>>1)+start;
		int end1 = mid;
		int start2 = mid+1;
		int end2 = end;
		
		merge_sort(attr,result,start1,end1);
		merge_sort(attr,result,start2,end2);
		int k=start;
		while(start1<=end1 && start2 <= end2) 
			result[k++] = attr[start1] > attr[start2]? attr[start2++] : attr[start1++];
		while(start1 <= end1)
			result[k++] = attr[start1++];
		
		while(start2 <= end2)
			result[k++] = attr[start2++];
		
		for(k=start; k<=end; k++) 
			attr[k] = result[k];
	}
}
