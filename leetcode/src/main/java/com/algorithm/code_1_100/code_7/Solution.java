package com.algorithm.code_1_100.code_7;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Solution {
    public int reverse(int x) {
        int val = 0;
        while(x != 0) {
            if(val > Integer.MAX_VALUE/10 || val < Integer.MIN_VALUE / 10) {
                return 0;
            }
            val = val * 10 + x % 10;  //推入
            x /= 10;   //弹出
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverse(123));
    }
}
