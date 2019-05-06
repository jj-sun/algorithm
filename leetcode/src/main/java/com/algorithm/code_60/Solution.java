package com.algorithm.code_60;

import java.util.Arrays;

public class Solution {

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int j = digits.length - 1; j >= 0; j--) {
            int cur = digits[j] + carry;
            carry = cur / 10;
            int res = cur % 10;
            digits[j] = res;
        }

        if (carry > 0) {
            int array[] = new int[digits.length + 1];
            array[0] = carry;
            for (int i = 1; i < array.length; i++) {
                array[i] = digits[i - 1];
            }
            return array;
        }
        return digits;
    }

    public static void main(String[] args) {
        sout(new Solution().plusOne(new int[]{9,9,9,9}));
    }

    public static void sout(int[] array) {
        for (int res : array) {
            System.out.print(res + " ");
        }
    }

}


