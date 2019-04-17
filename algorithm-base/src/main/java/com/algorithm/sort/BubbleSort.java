package com.algorithm.sort;


public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {3,1,7,9,2,6};
		bubbleSort(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static <T extends Comparable<? super T>> void bubbleSort(T[] data) {
		int position,scan;
		T temp;
		for(position = data.length-1; position>=0; position--) {
			for(scan=0; scan<=position-1; scan++) {
				if(data[scan].compareTo(data[scan+1]) > 0) {
					temp = data[scan];
					data[scan] = data[scan+1];
					data[scan+1] = temp;
				}
			}
		}
	}

	public static void bubbleSort(int[] data) {
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length-1-i; j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}
		}
	}
}
