package com.myhexin.swordOffice;

public class JumpFloorII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int jumpFloorII(int target) {
        if(target <= 0) return 0;
        if(target <= 2) return target;
        
        int result = 1;
        for(int i=1; i<=target; i++) {
        	result *= 2;
        }
        return result;
        
    }
}
