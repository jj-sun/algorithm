package com.algorithm.com_52.multiply;

public class Solution {
    public int[] multiply(int[] A) {
    	if(A == null || A.length < 2)
    		return A;
    	int[] B = new int[A.length];
    	
    	B[0] = 1;
    	
    	for(int i=1; i<A.length; i++) {
    		B[i] = B[i-1] * A[i-1];
    	}
    	
    	double temp = 1;
    	
    	for(int i=A.length-2; i>=0; --i) {
    		temp *= A[i+1];
    		B[i] *= temp;
    	}
    	
    	
    	return B;
    }
}