package com.algorithm.com_31.FindGreatestSumOfSubArray;

public class Solution {
	public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0) return 0;
        int maxSum = array[0];
        int thisSum = array[0];
        for(int i=1; i<array.length; i++) {
        	thisSum += array[i];
        	if(thisSum > maxSum)
        		maxSum = thisSum;
        	else if(thisSum < 0)
        		thisSum = 0;
        }
        return maxSum;
    }
	public static void main(String[] args) {
		int[] array = {1,-2,3,10,-4,7,2,-5};
		System.out.println(new Solution().FindGreatestSumOfSubArray(array));
	}
}
