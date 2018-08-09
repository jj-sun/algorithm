package com.myhexin.swordOffice;

/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 */
public class ReOrderArray {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		new ReOrderArray().reOrderArray(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	 public void reOrderArray(int [] array) {
	      if(array == null || array.length < 1)
	    	  return;
	      int count = 0;
	      int[] newArray = new int[array.length];
	      for(int i=0; i<array.length; i++) {
	    	  if((array[i]&1) == 1) 
	    		  count ++;
	      }
	      int num = 0;
	      for(int i=0; i<array.length; i++) {
	    	  if((array[i]&1) == 1) newArray[num++] = array[i];
	    	  else 
	    		  newArray[count++] = array[i];
	      }
	      
	      for(int i=0; i<array.length; i++) {
	    	  array[i] = newArray[i];
	      }
	 }

}
