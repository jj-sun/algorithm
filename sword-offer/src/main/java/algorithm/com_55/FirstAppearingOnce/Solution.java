package com.myhexin.com_55.FirstAppearingOnce;

public class Solution {
	
	int occurrence[] = new int[256];
	int index = 1;
	// Insert one char from stringstream
	public void Insert(char ch) {
		if(occurrence[ch] == 0) 
			occurrence[ch] = index;
		else if(occurrence[ch] >= 1)
			occurrence[ch] = -2;
		index++;
		//System.out.println(occurrence[ch]);
	}

	// return the first appearence once char in current stringstream
	public char FirstAppearingOnce() {
		char ch = '#';
		int minIndex=Integer.MAX_VALUE;
		for(int i=0; i<occurrence.length; i++) {
			
			if(occurrence[i] >= 1 &&  occurrence[i] < minIndex)  {
				ch = (char)i;
				minIndex = occurrence[i];
			}
		}
		
		return ch;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		char[] c = {'g','o','o','g','l','e'};
		for(int i=0; i<c.length; i++) {
			s.Insert(c[i]);
			System.out.println(s.FirstAppearingOnce());
		}
	}
}
