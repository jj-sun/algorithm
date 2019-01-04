package com.algorithm.sort;
/**
 * �鲢����
 * @author sun
 *
 */
public class MergeSort {
	
	/**
	 * 
	 * @param X�鲢����
	 * @param Y��������
	 * @param start1��һ�������е���ʼ�±�
	 * @param start2�ڶ��������е���ʼ�±�
	 * @param length�����еĳ���
	 */
	//һ�ι鲢
	public static void merge(int[] X, int[] Y,int start1, int start2, int length) {
		int i = start1;
		int j = start2;
		int k = start1;
		while(i < start2 && j < start2+length && j < X.length) {   //��X���������������й鲢��Y��
			if(X[i] > X[j])                                        //����Сֵ���Ƶ�Y��
				Y[k++] = X[j++];
			else
				Y[k++] = X[i++];
			
			while(i<start2)       //��ǰһ��������ʣ��Ԫ�ظ��Ƶ�Y��
				Y[k++] = X[i++];
			
			while(j<start2+length && j<X.length)    //����һ��������ʣ��Ԫ�ظ��Ƶ�Y��
				Y[k++] = X[j++];
		}
	}
	/**
	 * һ�˹鲢
	 * @param X
	 * @param Y
	 * @param length
	 */
	public static void mergepass(int[] X,int[] Y, int length) {
		int i=0;
		while(i<X.length-2*length+1) {
			merge(X, Y,i,i+length,length);
			i += 2*length;
		}
		
		if(i+length < X.length) 
			merge(X, Y,i,i+length,length);
		else {
			int j = i;
			while(j < X.length)
				Y[j++] = X[j++];
		}
	}
	
	public static void main(String[] args) {
		int a[] = {2,7,5,8,9,3};
		merge_sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	
	/**
	 * �鲢����
	 * @param attr
	 */
	public static void merge_sort(int[] attr) {
		int len = attr.length;
		int[] result = new int[len];
		merge_sort(attr,result,0,len-1);
	}
	/**
	 * �����鲢
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
