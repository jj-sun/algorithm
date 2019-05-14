package com.algorithm.code_1_100.code_9;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if((x < 0) || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int rev = 0;
        //我们将原始数字除以 10，然后给反转后的数字乘上 10，
        //所以，当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。
        while(x > rev) {
            rev = rev * 10 + x%10;
            x /= 10;
        }


        return x == rev || x == rev /10;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(12321));
    }
}
