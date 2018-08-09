package com.myhexin.com_42_2.LeftRotateString;

public class Solution {
	public String LeftRotateString(String str, int n) {
		if(str== null || str.length() == 0 || n > str.length())
			return "";
		return str.substring(n)+str.substring(0, n);
	}
}
