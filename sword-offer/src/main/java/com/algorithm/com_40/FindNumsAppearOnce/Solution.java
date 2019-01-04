package com.algorithm.com_40.FindNumsAppearOnce;

public class Solution {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if(array == null || array.length < 2)
			return;
		int resultOR = 0;
		for(int i=0; i<array.length; i++)
			resultOR ^= array[i];
		int indexOf1 = findFirstBitIs1(resultOR);
		num1[0] = 0;
		num2[0] = 0;
		for(int i=0; i<array.length; i++) {
			if(IsBit1(array[i], indexOf1)) 
				num1[0] ^= array[i];
			else
				num2[0] ^= array[i];
		}
		
	}

	private int findFirstBitIs1(int resultOR) {
		int index = 0;
		while((resultOR & 1) == 0) {
			resultOR = resultOR >> 1;
			index ++;
		}
				
		return index;
	}
	private  boolean IsBit1(int num, int index) {
		num = num >> index;
		return (num&1) == 1 ? true:false;
	}
}
