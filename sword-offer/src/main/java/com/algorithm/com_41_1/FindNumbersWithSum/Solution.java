package com.algorithm.com_41_1.FindNumbersWithSum;

import java.util.ArrayList;

/**
 * ����һ����������������һ������S�� �������в�����������ʹ�����ǵĺ�������S�� ����ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * 
 * @author sun
 *
 */
public class Solution {
	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (array == null || array.length < 1)
			return list;
		int head = 0;
		int behind = array.length - 1;
		while (head < behind) {
			int curSum = array[head] + array[behind];
			if (curSum == sum) {
				list.add(array[head]);
				list.add(array[behind]);
				break;
			} else if (curSum > sum)
				behind--;
			else
				head++;
		}
		return list;
	}
	public static void main(String[] args) {
		int[] array = {1,2,4,7,11,15};
		ArrayList<Integer> list = new Solution().FindNumbersWithSum(array, 15);
		System.out.println(list.toString());
	}
}
