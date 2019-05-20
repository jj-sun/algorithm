package com.algorithm.code_1_50.code_17;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */

public class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();
        String[] str = new String[digits.length()];
        if(digits.length() == 0) {
            return list;
        }
        for(int i=0; i<str.length; i++) {
            switch (digits.charAt(i)) {
                case '2':str[i] = "abc";break;
                case '3':str[i]="def";break;
                case '4':str[i]="ghi";break;
                case '5':str[i]="jkl";break;
                case '6':str[i]="mno";break;
                case '7':str[i]="pqrs";break;
                case '8':str[i]="tuv";break;
                case '9':str[i]="wxyz";break;
                default:break;
            }
        }
        getStringWithFor(str,list,"",0);
        return list;
    }

    /**
     * 回溯法
     * @param str
     * @param list
     * @param temp
     * @param k
     */
    private void getStringWithFor(String[] str,List<String> list,String temp,int k) {
        if(k == str.length) {
            list.add(temp);
        } else {
            for(int i=0; i<str[k].length();i++) {
                getStringWithFor(str,list,temp + str[k].charAt(i),k+1);
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().letterCombinations("23"));
    }
}
