package com.algorithm.code_58;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
public class Solution {

    public int lengthOfLastWord(String s) {

        int j = s.length() - 1;
        while(j >= 0 && s.charAt(j) == ' ') {
             j--;
        }
        int i = j;
        while(i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        return j-i;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
    }

}
