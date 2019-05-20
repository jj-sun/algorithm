package com.algorithm.code_1_50.code_16;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 */

public class Solution {

    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int len = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        for(int i=0; i<len; i++) {
            int l = i+1 , r = len-1;
            while (l < r) {
                int temp = nums[i] + nums[l] + nums[r];
                if(Math.abs(temp - target) < Math.abs(res - target)) {
                    res = temp;
                }
                if(temp > target) {
                    r--;
                } else if (temp < target) {
                    l++;
                }else {
                    return target;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,0};
        System.out.println(new Solution().threeSumClosest(nums,-100));
    }

}
