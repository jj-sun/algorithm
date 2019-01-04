package com.algorithm.swordOffice;
/**
 * ���������������кϲ����ϲ�֮�����Ҳ�������
 * @author dell
 *
 */
public class TwoArrayCombine {

	public static void main(String[] args) {
		int a[] = new int[10];
		for(int i=0; i<6; i++) {
			a[i] = i+1;
		}
		a[6] = '\0';
		for(int i=0; i<6; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		int b[] = {7,8,9,10};
		
		for(int i=0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
		combine(a,b);
	}
	
	public static void combine(int a[],int b[]) {
		int length = 0;
		while(a[length] != '\0')
			length++;
		int l = a.length-1;
		//System.out.println(length);
		int bl = b.length-1;
		length--;
		System.out.println(l);
		System.out.println(b.length);
		System.out.println(length);
		while(l >= 0) {
			if(b[bl] > a[length]) {
				a[l] = b[bl];
			}
			else {
				a[l] = a[length];
				//length--;
			}
			--l;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	
	//12345    6789
}
