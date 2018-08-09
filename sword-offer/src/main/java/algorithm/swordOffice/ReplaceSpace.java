package com.myhexin.swordOffice;

/**
 * �滻�ո�,��һ���ַ��еĿո񱻣��������滻��
 * @author dell
 *
 */
public class ReplaceSpace {

	public static void main(String[] args) {
//		String str = "We are family";
//		char[] st = new char[20];
//		int i=0;
//		while(i <str.length()) {
//			st[i] = str.charAt(i);
//			i++;
//		}
//		st[i] = '\0';
		StringBuffer str = new StringBuffer("We are family");
		System.out.println(replaceSpace(str));
	}
	
	public static String replaceSpace(StringBuffer str) {
//		StringBuffer buf = new StringBuffer();
//		for(int i=0; i<str.length(); i++) {
//			if(str.charAt(i) == ' ') {
//				buf.append("%20");
//			}
//			else
//				buf.append(str.charAt(i));
//		}
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				str.replace(i, i+1, "%20");
			}
		}
		return new String(str);
    }
	public static String replace(String str) {
		StringBuffer buf = new StringBuffer();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				buf.append("%20");
			}
			else
				buf.append(str.charAt(i));
		}
		return new String(buf);
	}
	
	public static String replace(char string[],int length) {
		if(string == null || length <= 0)
			return null;
		int originalLength = 0;
		int numberlength = 0;
		int i=0;
		while(string[i] != '\0') {
			++originalLength;
			if(string[i] == ' ') {
				++numberlength;
			}
			++i;
		}
		int newLength = originalLength + numberlength*2;
		
		int indexOfOriginal = originalLength;
		int indexOfNew = newLength;
		while(indexOfOriginal >= 0 && indexOfNew > indexOfOriginal) {
			if(string[indexOfOriginal] == ' ') {
				string[indexOfNew--] = '0';
				string[indexOfNew--] = '2';
				string[indexOfNew--] = '%';
			}
			else {
				string[indexOfNew--] = string[indexOfOriginal];
			}
			--indexOfOriginal;
		}
		return new String(string);
	}
}
