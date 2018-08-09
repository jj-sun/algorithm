package com.myhexin.com_03.Find;

public class Solution {
	public boolean Find(int [][] array,int target) {
		boolean found = false;
		int rows = array.length;
		int colums = array[0].length;
		if(array != null || rows > 0 || colums > 0) {
			int row = 0;
			int colum = colums-1;
			while(row < rows && colum >= 0) {
				
				if(array[row][colum] == target) {
					found = true;
					break;
				}else if(array[row][colum] > target)
					--colum;
				else
					++row;
				
			}
		}
		return found;
    }
}
