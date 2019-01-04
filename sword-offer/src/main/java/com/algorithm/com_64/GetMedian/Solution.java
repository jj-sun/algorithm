package com.algorithm.com_64.GetMedian;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	ArrayList<Integer> list = new ArrayList<Integer>();
	public void Insert(Integer num) {
		list.add(num);
		Collections.sort(list);
	}

	public Double GetMedian() {
		int mid = list.size()/2;
		if((list.size()&1) == 0) {
			Integer a = list.get(mid);
			Integer b = list.get(mid-1);
			return (Double.valueOf(a+"")+Double.valueOf(b+""))/2;
		}else {
			Integer s = list.get(mid);
			return Double.valueOf(s.toString());
		}
	}
}
