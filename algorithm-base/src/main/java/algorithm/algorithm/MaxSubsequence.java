package algorithms.algorithm;

/**
 * ����������������
 * @author dell
 *
 */
public class MaxSubsequence {
	
	public static void main(String[] args) {
		int[] a = {-2,11,-4,13,-5,2};
		//int[] a = {1,-3,4,-2,-1,6};
		int max = MaxSubsequenceSum2(a);
		System.out.println(max);
	}
	
	
	/**
	 * �����㷨��ʱ�临�Ӷ�ΪO(N^3);
	 * @param a ����һ����������
	 * @return  ������������������
	 */
	public static int MaxSubsequenceSum1(int[] a) {
		int maxSum = 0;
		int seStart = 0;
		int seEnd = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				int thisSum = 0;
				for(int k=i; k<=j; k++) {
					thisSum += a[k];
				}
				
				if(thisSum > maxSum) {
					maxSum = thisSum;
					seStart = a[i];
					seEnd = a[j];
				}
			}
		}
		System.out.println(seStart + "---->" +seEnd);
		return maxSum;
	}
	
	/**
	 *  ���㷨��ʱ�临�ӵ�ΪO(N^2);
	 * @param array ����һ����������
	 * @return ���������к͵����ֵ
	 */
	public static int MaxSubsequenceSum2(int[] array) {
		int maxSum = 0;
		int seStart = 0;
		int seEnd = 0;
		for(int i=0; i<array.length; i++) {
			int thisSum = 0;
			for(int j=i; j<array.length; j++) {
				thisSum += array[j];
				if(maxSum < thisSum) {
					maxSum = thisSum;
					seStart = array[i];
					seEnd = array[j];
				}
			}
		}
		System.out.println(seStart + "---->" +seEnd);
		
		return maxSum;
	}
	
	/**
	 * �����㷨��ʱ�临�Ӷ�ΪO(N);
	 * @param array
	 * @return
	 */
	public static int MaxSubsequenceSum3(int[] array) {
		int maxSum = 0;
		int thisSum = 0;
		for(int j=0; j<array.length; j++) {
			thisSum += array[j];
			if(thisSum > maxSum) 
				maxSum = thisSum;
			else if(thisSum < 0) 
				thisSum = 0;
		}
		return maxSum;
	}
}
