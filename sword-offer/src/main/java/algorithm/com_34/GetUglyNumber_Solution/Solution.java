package com.myhexin.com_34.GetUglyNumber_Solution;
/*
 * 
 * �ҳ���
 */
public class Solution {
	public int GetUglyNumber_Solution(int index) {
		if(index < 0) return 0;
		int[] pUglyNumber = new int[index];
		pUglyNumber[0] = 1;
		int nextUglyIndex = 1;
		int[] pM2 = pUglyNumber;
		int[] pM3 = pUglyNumber;
		int[] pM5 = pUglyNumber;
		int p2 = 0;
		int p3 = 0;
		int p5 = 0;
		while(nextUglyIndex < index) {
			int min = Min(pM2[p2]*2,pM3[p3]*3,pM5[p5]*5);
			pUglyNumber[nextUglyIndex] = min;
			while(pM2[p2]*2 <= pUglyNumber[nextUglyIndex])
				++p2;
			while(pM3[p3]*3 <= pUglyNumber[nextUglyIndex])
				++p3;
			while(pM5[p5]*5 <= pUglyNumber[nextUglyIndex])
				++p5;
			++nextUglyIndex;
		}
		int ugly = pUglyNumber[nextUglyIndex-1];
		return ugly;
	}
	public int Min(int number1, int number2, int number3) {
		int min = number1 > number2 ? number2:number1;
		min = min > number3?number3:min;
		return min;
	}
	public static void main(String[] args) {
		int x = new Solution().GetUglyNumber_Solution(4);
		System.out.println(x);
	}
}
