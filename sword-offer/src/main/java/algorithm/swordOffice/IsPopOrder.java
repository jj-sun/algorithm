package com.myhexin.swordOffice;

import java.util.ArrayList;

public class IsPopOrder {
	 public boolean isPopOrder(int [] pushA,int [] popA) {
		 if(pushA.length == 0 || popA.length == 0)
			 return false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		 int index = 0;
		 for(int i=0; i<pushA.length; i++) {
			 list.add(pushA[i]);
			 while(!list.isEmpty() && list.get(list.size()-1) == popA[index]) {
				 list.remove(list.size()-1);
				 index++;
			 }
		 }
		 return list.isEmpty();
	 }
}
