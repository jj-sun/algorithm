package com.algorithm.code_67;

public class Solution {

    public String addBinary(String a, String b) {

        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        StringBuffer result = new StringBuffer();

        int la = a.length(),lb = b.length();
        int carry = 0;
        for(int i = la - 1, j = lb - 1 ; i >= 0 || j >= 0 ; i-- , j--) {
            int aTemp = 0;
            int bTemp = 0;

            if(i >=0) {
                aTemp = aa[i] - '0';
            }

            if(j >= 0) {
                bTemp = bb[j] - '0';
            }

            int cur = aTemp + bTemp + carry;
            result.insert(0,cur % 2);
            carry = cur / 2;

        }
        if(carry > 0 ) {
            result.insert(0,carry);
        }

        return result.toString();
    }

}
