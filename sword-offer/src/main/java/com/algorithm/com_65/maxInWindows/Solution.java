package com.algorithm.com_65.maxInWindows;

import java.util.ArrayList;

public class Solution {
	public ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (size > num.length || size == 0)
			return list;
		for (int i = 0; i <= num.length - size; i++) {
			int max = num[i];
			for (int j = i + 1; j < i + size; j++) {
				if (num[j] > max) {
					max = num[j];
				}
			}
			list.add(max);
		}
		return list;
	}
}
