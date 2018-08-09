package com.myhexin.com_54.isNumeric;

public class Solution {
	private int index = 0;
	public boolean isNumeric(char[] str) {
		if(str == null || str.length < 1) 
			return false;
		if(str[index] == '+' || str[index] == '-')
			index++;
		if(index == str.length)
			return false;
		boolean numeric = true;
		scanDigits(str);
		if(index < str.length) {
			if(str[index] == '.') {
				++index;
				scanDigits(str);
				if(index == str.length)
					return numeric && index == str.length;
				if(str[index] == 'e' || str[index] == 'E')
					numeric = isExponential(str);
			}else if(str[index] == 'e' || str[index] == 'E')
				numeric = isExponential(str);
			else
				numeric = false;
		}
		return numeric && index == str.length;
	}
	private boolean isExponential(char[] str) {
		if(str[index] != 'e' && str[index] != 'E') return false;
		
		++index;
		if(index == str.length) return false;
		if(str[index] == '+' || str[index] == '-')
			++index;
		if(index == str.length) return false;
		scanDigits(str);
		
		return index == str.length ? true : false;
	}
	private void scanDigits(char[] str) {
		while(index < str.length && str[index] >= '0' && str[index] <= '9')
			index ++;
	}
	
	public static void main(String[] args) {
		char[] str = {'1','2','e'};
		boolean flag = new Solution().isNumeric(str);
		System.out.println(flag);
	}
}
