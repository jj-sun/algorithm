package com.algorithm.swordOffice;

public class Fibonacci {

	public static void main(String[] args) {
		Fibonacci f= new Fibonacci();
		
		System.out.println(f.Fibonaccis(7));

	}
	public int Fibonaccis(int n) {
		if(n <=0 ) return 0;
		if(n==1 || n==2 ) return 1;
		int m = 1;
		int m1 = 1;
		int result = 0;
		for(int i=3; i<=n; i++) {
			result = m + m1;
			m = m1;
			m1 = result;
			
		}
		return result;
    }
	
}
