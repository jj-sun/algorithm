package com.algorithm.com_35.FirstNotRepeatingChar;
/*
 * �ҳ��ַ����е�һ���ַ�����Ϊһ����
 * ����λ��
 */
public class Solution {
	public int FirstNotRepeatingChar(String str) {
		if(str == null || str.length() == 0) return -1;
		int[] hashTable = new int[60];
		char[] hashKey = str.toCharArray();
		int index = 0;
		while(index < hashKey.length)
			hashTable[hashKey[index++]-'A']++;
		index = 0;
		while(index < hashKey.length) {
			if(hashTable[hashKey[index]-'A'] == 1) 
				return index;
			index++;
		}
		
		return -1;
	}
	public static void main(String[] args) {
		int a = new Solution().FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp");
		System.out.println(a);
		
	}
}
