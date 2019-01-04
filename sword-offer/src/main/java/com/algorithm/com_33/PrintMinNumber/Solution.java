package com.algorithm.com_33.PrintMinNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	public String PrintMinNumber(int[] numbers) {
		int n;
		String s = "";
		ArrayList<Integer> list = new ArrayList<Integer>();
		n = numbers.length;
		for(int i=0; i<n; i++) {
			list.add(numbers[i]);
		}
		Collections.sort(list, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				String s1 = o1+""+o2;
				String s2 = o2 + "" + o1;
				
				return s1.compareTo(s2);
			}
			
		});
		for(int j:list) {
			s += j;
		}
		return s;
	}
	public static void main(String[] args) {
		int a[] = {3,32,321};
		String s = new Solution().PrintMinNumber(a);
		System.out.println(s);
	}
	
}
