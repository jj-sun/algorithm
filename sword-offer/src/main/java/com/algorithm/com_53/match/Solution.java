package com.algorithm.com_53.match;

public class Solution {
	public boolean match(char[] str, char[] pattern) {
		if(str == null || pattern == null) 
			return false;
		return matchCore(str,0,pattern,0);
	}

	private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
		if(str.length == strIndex && pattern.length == patternIndex) 
			return true;
		if(str.length != strIndex && pattern.length == patternIndex)
			return false;
		
		if((patternIndex + 1) < pattern.length && pattern[patternIndex+1] == '*') {
			if(str.length != strIndex && pattern[patternIndex] == str[strIndex] || (pattern[patternIndex] == '.' && str.length != strIndex))
				return matchCore(str, strIndex+1, pattern, patternIndex+2)
						|| matchCore(str, strIndex+1, pattern, patternIndex)
						|| matchCore(str, strIndex, pattern, patternIndex+2);
			else
				return matchCore(str, strIndex, pattern, patternIndex+2);
		}
		if(str.length != strIndex && str[strIndex] == pattern[patternIndex] || (pattern[patternIndex] == '.' && str.length != strIndex))
			return matchCore(str, strIndex+1, pattern, patternIndex+1);
		return false;
	}

}
