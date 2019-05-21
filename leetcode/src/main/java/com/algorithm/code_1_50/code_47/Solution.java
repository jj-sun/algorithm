package com.algorithm.code_1_50.code_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,1,2]
 * 输出:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 */

public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        permuteUnique(result, nums, 0);
        return result;
    }

    private void permuteUnique(List<List<Integer>> result, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> temp = Arrays.stream(nums).boxed().collect(Collectors.toList());
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = index; i < nums.length; i++) {
                if (!isUsed(nums,index,i)) {
                    swap(nums, i, index);
                    permuteUnique(result, nums, index + 1);
                    swap(nums, i, index);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    private boolean isUsed(int[] nums,int start , int end) {
        for(int i=start; i<end; i++) {
            if(nums[i] == nums[end]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-1,2,-1,2,1,-1,2,1};
        System.out.println(new Solution().permuteUnique(array));
    }

}
