package com.algorithm.com_46.Sum_Solution;

public class Solution {
	public int Sum_Solution(int n) {
		int sum = n;
		boolean falg = (n>0) && ((sum += Sum_Solution(n-1))>0);
		return sum;
	}
}
