package algorithms.sort;


/*
 * ֱ��ѡ������
 */
public class SelectSort {
	
	public static void selectSort(int[] table) {
		
		for(int i=0; i<table.length-1; i++) {             //n-1������
			
			int min = i;                                  //ÿ���ڴ�i��ʼ����������Ѱ����СԪ��
			for(int j=i+1; j<table.length; j++) {         //���i������Ԫ����С
				if(table[j] < table[min])                 //���������в�����Сֵ
					min = j;                              //��ס��СԪ���±�
			}
			
			if(min != i) {                                //��������СԪ�ؽ�����ǰ��
				int temp = table[i];
				table[i] = table[min];
				table[min] = temp;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {2,7,5,8,9,3};
		selectSort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
