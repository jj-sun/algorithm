package com.myhexin.coom.Test;

public class Test {

	public static void main(String[] args) {
		String[] arr = {"abcd","defg","gtdj","jlcl"};
		System.out.println(get(arr));
	}
	public static int get(String[] arr) {
		char[] str = new char[2*arr.length];
		int index=0;
		for(int i=0; i<arr.length; i++) {
			str[index++] = arr[i].charAt(0);
			str[index++] = arr[i].charAt(arr[i].length()-1);
		}
		
		int count;
		int sum = 0;
		for(int i=0; i<str.length; i++) {
			count = 0;
			count ++;
			for(int j=0; j<str.length; j++) {
				if(j != i && str[i] == str[j])
					count ++;
			}
			if(count == 2)
				sum++;
		}
		if((sum/2) == (arr.length-1))
			return 1;
		return -1;
	}

}
