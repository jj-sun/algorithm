package com.myhexin.com_41_2.FindContinuousSequence;

import java.util.ArrayList;

public class Solution {
	public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		if (sum < 3)
			return list;
		int middle = (sum + 1) / 2;
		int small = 1;
		int big = 2;
		int curSum = small + big;
		while (small < middle) {
			if (curSum == sum)
				list.add(getContinuousSequence(small, big));
			while (curSum > sum && small < middle) {
				curSum -= small;
				small++;
				if(curSum == sum)
					list.add(getContinuousSequence(small, big));
			}
			big++;
			curSum += big;
		}
		return list;
	}

	public ArrayList<Integer> getContinuousSequence(int small, int big) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (small > big)
			return list;
		for (int i = small; i <= big; i++) {
			list.add(i);
		}
		return list;
	}
}
