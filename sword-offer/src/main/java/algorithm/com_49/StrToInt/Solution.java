package com.myhexin.com_49.StrToInt;

public class Solution {
	boolean isValid = true;

	public int StrToInt(String str) {
		isValid = true;
		long num = 0;
		if (str == null || str.length() < 1) {
			isValid = false;
			return 0;
		}

		char[] c = str.toCharArray();
		int index = 0;
		boolean minus = false;
		if (c[0] == '+')
			index++;
		else if (c[0] == '-') {
			index++;
			minus = true;
		}

		for (int i = index; i < c.length; i++) {
			if (c[i] >= '0' && c[i] <= '9') {
				int flag = minus ? -1 : 1;

				num = num * 10 + flag * (c[i] - '0');

			} else {
				isValid = false;
				return 0;
			}
		}
		if ((!minus && num > Integer.MAX_VALUE) || (minus && num < Integer.MIN_VALUE)) {

			isValid = false;
			return 0;
		}
		return (int)num;
	}

	public static void main(String[] args) {
		
	}

}
