package com.myhexin.swordOffice;


/**
 * 
 * ��ά�����еĲ���
 *��ά������У������ң���С�����д��ϵ��£���С����
 */
public class Search {

	public static void main(String[] args) {
		int array[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println(Find(array,4));
	}
	
	public static  boolean Find(int [][] array,int target) {
		boolean found = false;
		int row = 0;
		int col = array[0].length-1;
		while(row < array.length && col >= 0) {
			if(array[row][col] == target) {
				found = true;
				break;
			}
			else if(array[row][col] > target)
				--col;
			else 
				++row;
		}
		return found;
	}
}
