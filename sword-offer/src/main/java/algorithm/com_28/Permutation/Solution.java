package com.myhexin.com_28.Permutation;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<>();
		if(str == null || str.length() == 0) return list;
		Permutation(str.toCharArray(),0,list);
		Collections.sort(list);
	    return list;   
    }

	private void Permutation(char[] charArray, int index, ArrayList<String> list) {
		if(index == charArray.length-1)
			list.add(String.valueOf(charArray));
		else {
			for(int i=index;i < charArray.length; ++i) {
				if(i == index || charArray[i] != charArray[index]) {
					swap(charArray,i,index);
					Permutation(charArray, index+1, list);
					swap(charArray,i,index);
				}
			}
		}
	}
	private void swap(char[] array,int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
}
