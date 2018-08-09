package com.myhexin.com_44.isContinuous;

import java.util.Arrays;

public class Solution {
	public boolean isContinuous(int[] numbers) {
		if(numbers == null || numbers.length != 5)
			return false;
		Arrays.sort(numbers);
		int numberOfZero = 0;
		int numberOfGap = 0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == 0)
				numberOfZero++;
		}
		System.out.println("zero "+numberOfZero);
		int small = numberOfZero;
		int big = small+1;
		while(big < numbers.length) {
			if(numbers[small] == numbers[big])
				return false;
			numberOfGap += numbers[big]-numbers[small]-1;
			small = big;
			++big;
		}
		System.out.println("gap " + numberOfGap);
		return numberOfGap > numberOfZero ? false : true;
	}
	public static void main(String[] args) {
		int[] array = {1,3,2,5,4};
		boolean flag = new Solution().isContinuous(array);
		System.out.println(flag);
	}
}
