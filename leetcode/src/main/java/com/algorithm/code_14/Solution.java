package com.algorithm.code_14;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length < 1) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        String str = strs[0];
        for(int i=1; i< strs.length; i++) {
            str = longestCommonPrefix(str,strs[i]);
            if(str.length() == 0) {
                break;
            }
        }
        return str;
    }
    public String longestCommonPrefix(String first, String second) {
        int min = Math.min(first.length(),second.length());
        int i=0;
        while(i < min) {
            if(first.charAt(i) != second.charAt(i)) {
                break;
            }
            i++;
        }

        return first.substring(0,i);
    }
}
