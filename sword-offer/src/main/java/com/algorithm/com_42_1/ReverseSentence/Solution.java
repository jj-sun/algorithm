package com.algorithm.com_42_1.ReverseSentence;

public class Solution {
	public String ReverseSentence(String str) {
		if(str==null||str.length()==0||str.trim().length()==0)
            return str;
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		int start = 0;
		int end = 0;
		int length = sb.length();
		char[] string = sb.toString().toCharArray();
		while(end <= length) {
			if(sb.charAt(start) == ' ') {
				start++;
				end++;
			}else if(end == length || sb.charAt(end) == ' ') {
				Reverse(string, start, end-1);
				start = ++end;
			}else {
				end ++;
			}
		}
		return String.valueOf(string);
	}
	public void Reverse(char[] s,int start,int end) {
		while(start < end) {
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;
			start ++;
			end --;
		}
	}
	public static void main(String[] args) {
		String str = new Solution().ReverseSentence("wonder");
		System.out.println(str);
	}
}
