package com.myhexin.swordOffice;

public class JumpFloor {

	public static void main(String[] args) {
		
	}
	public int jumpFloor(int target) {
		if(target<=0) return 0;
		if(target<=2) return target;
		
		int m1 = 1;
		int m2 = 2;
		int result = 0;
		for(int i=3; i <= target; i++) {
			result = m1 + m2;
			m1 = m2;
			m2 = result;
		}
		return result;
	}
}
