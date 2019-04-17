package com.algorithm.code_38;

public class Solution {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }else {
            String preStr = countAndSay(n-1);
            StringBuilder res = new StringBuilder();
            int count;
            for(int i=0; i<preStr.length();) {
                count = 0;
                while(i+count <preStr.length() && preStr.charAt(i+count) == preStr.charAt(i)) {
                    count++;
                }
                res.append(count);
                res.append(preStr.charAt(i));
                i += count;
            }
            return res.toString();
        }
    }
}
