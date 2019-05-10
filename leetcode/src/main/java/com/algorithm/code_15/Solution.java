package com.algorithm.code_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 *
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 *
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        int len = nums.length;
        for(int i=0; i<len; i++) {
            //如果大于0，则三数之和不可能等于0
            if(nums[i] > 0) {
                break;
            }
            //如果两个数相同，则跳过
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = 0 - nums[i];
            int l = i+1 , r = len-1;
            while(l < r) {
                if((nums[l] + nums[r]) == target) {
                    List<Integer> list = new ArrayList<>(5);
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);

                    //这两个while循环是为了跳过重复的数
                    while(l < r && nums[l] == nums[l+1]) {
                        l++;
                    }
                    while(l < r && nums[r] == nums[r-1]) {
                        r--;
                    }

                    l++;
                    r--;
                } else if(nums[l] + nums[r] < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return res;
    }
}
