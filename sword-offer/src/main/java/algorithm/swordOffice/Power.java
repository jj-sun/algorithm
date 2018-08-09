package com.myhexin.swordOffice;

public class Power {

	public static void main(String[] args) {

	}
	
	public double power(double base, int exponent) {
      //  return Math.pow(base, exponent);
        double sum=1;
        int temp=Math.abs(exponent);
        while(temp-->0){
            sum=sum*base;
        }
        if(exponent<0)sum=1/sum;
        return sum; 
	  }

}
