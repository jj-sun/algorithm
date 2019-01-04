package com.algorithm.com_30.GetLeastNumbers;

import java.util.ArrayList;
import java.util.TreeSet;

public class Solution {
	 public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
	        TreeSet<Integer> set = new TreeSet<Integer>();
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        if(input == null || k > input.length) return list;
	        for (int i = 0; i < input.length; i++) {
	            if (set.size() < k)
	                set.add(input[i]);
	 
	            else if (set.size() > 0 && set.last() > input[i]) {
	                set.pollLast();
	                set.add(input[i]);
	            }
	        }
	        if (set.size() == k && k != 0)
	            list.addAll(set);
	        return list;
	 }
}
