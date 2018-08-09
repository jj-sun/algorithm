package algorithms.sort;


/*
 * ϣ������
 * ϣ������ĺ��ľ��ǲ������򣬽�һ���������зֳ�������
 */
public class ShellSort {
	
	/**
	 * 
	 * @param table
	 */
	public static void shellSort(int[] table) {
		
		for(int delta=table.length/2; delta>0; delta/=2) {    //������ɨ�裬������������������
			
			for(int i=delta; i<table.length; i++) {   //һ�˷������飬ÿ�����ֱ�Ӳ�������
				int tmp = table[i];    //��ǰ������Ԫ��
				int j;
				for(j=i-delta; j>=0&&tmp<table[j]; j-=delta)     //ÿ��Ԫ�����deltaԶ��Ѱ�Ҳ���λ��
					table[j+delta] = table[j];
				table[j+delta] = tmp;   //����Ԫ��
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {2,7,5,8,9,3};
		shellSort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
