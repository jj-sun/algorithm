package com.algorithm.code_1_100.code_34;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1,-1};
        int l = 0 , r = nums.length-1;
        while(l <= r) {
            int mid = (l + r) >> 1;
            if(target == nums[mid]) {
                 l = mid;
                 r = mid;
                while(l-1 >=0 && nums[l] == nums[l-1]) {
                    l--;
                }
                while(r + 1 < nums.length && nums[r] == nums[r+1]) {
                    r++;
                }
                result[0] = l;
                result[1] = r;
                break;
            }else if(target >= nums[l] && target < nums[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] array = new int[] {5,7,7,8,8,8,8,8,10};
        sout(new Solution().searchRange(array,8));
    }
    public static void sout(int[] nums) {
        for(int res : nums) {
            System.out.print(res + " ");
        }
    }
}
