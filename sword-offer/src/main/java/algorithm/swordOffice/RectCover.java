package com.myhexin.swordOffice;

/*
我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？ 
*/
public class RectCover {
	 public int rectCover(int target) {
		 if(target <= 0)  return 1;
		 if(target < 3) return target; 
		 	
		 int n1 = 1;
		 int n2 = 2;
		 int sum = 0;
		 for(int i=3; i<=target; i++) {
			 sum = n1 + n2;
			 n1 = n2;
			 n2 = sum;
		 }
		 return sum;
	    }
}
