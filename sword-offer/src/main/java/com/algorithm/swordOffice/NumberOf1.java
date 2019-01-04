package com.algorithm.swordOffice;

public class NumberOf1 {

	public static void main(String[] args) {
		int a = new NumberOf1().numberOf2(-12);
		System.out.println(a);
	}
	
	public int  numberOf1(int n) {
		return Integer.toBinaryString(n).replace("0", "").length();
    }
	
	public int numberOf2(int n) {
		int count = 0;
		int flag = n;
		while(flag != 0) {
			count ++;
			flag = flag & (flag-1);
		}
		return count;
	}
}
