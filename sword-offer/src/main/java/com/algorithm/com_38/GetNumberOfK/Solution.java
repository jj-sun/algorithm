package com.algorithm.com_38.GetNumberOfK;

public class Solution {
	public int GetNumberOfK(int[] array, int k) {
		if(array != null && array.length >0) {
			int left = GetFirstOfK(array, k, 0, array.length-1);
			int right = GetLastOfK(array, k, 0, array.length-1);
			if(left > -1 && right > -1)
				return right - left + 1;
		}
		return 0;
		
		
	}
	public int GetFirstOfK(int[] array,int k, int start, int end) {
		if(start > end)
			return -1;
		int middle = (end+start)/2;
		int data = array[middle];
		if(data == k) {
			if(middle > 0 && array[middle-1] != k || middle == 0) 
				return middle;
			else
				end = middle - 1;
		}
		else if(data > k)
			end = middle-1;
		else
			start = middle+1;
		return GetFirstOfK(array,k,start,end);
	}
	public int GetLastOfK(int[] array, int k, int start, int end) {
		if(start > end)
			return -1;
		int middle = (end + start)/2;
		int data = array[middle];
		if(data == k) {
			if(middle < array.length-1 && array[middle+1] != k || middle == array.length-1)
				return middle;
			else
				start = middle + 1;
		}
		else if(data > k)
			end = middle-1;
		else
			start = middle + 1;
		return GetLastOfK(array, k, start, end);
	}
}
