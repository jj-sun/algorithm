package com.algorithm.swordOffice;

public class SpinArray {

	public static void main(String[] args) {
		SpinArray s = new SpinArray();
		//int[] array = {2,2,1,2,2,2};
		//int[] array = {3,4,5,1,2};
		int array[] = {1,2,2,2,2,2};
		//int array[] = {};
		System.out.println(s.minNumberInRotateArray(array));
	}
	public int minNumberInRotateArray(int [] array) {
		if(array.length <=0 )return 0; 
		int start = 0;
		int end = array.length-1;
		if(array[start] < array[end]) return array[start];
		if((end-start) == 1) return array[end];
		int mid;
		while(start <= end ) {
			
			mid = (start+end)/2;
			if(array[start] == array[end] || array[start] == array[mid] || array[end] == array[mid]) {
				int min = array[start];
				for(int i=0; i<=end; i++) {
					if(array[i] < min) min = array[i];
				}
				return min;
			}
			System.out.println("dsjkfjksad");
			if(array[end] < array[mid]) 
				start = mid;
			else if(array[mid] < array[end])
				end = mid;
			else if(array[start] == array[mid])
				return array[start+1];
		}
		return 0;
    }

}
