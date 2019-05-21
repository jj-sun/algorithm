package com.algorithm.code_1_50.code_46;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(result,new ArrayList<>(),nums,0);
        return result;
    }

    private void permute(List<List<Integer>> result,List<Integer> temp,int[] nums,int index) {
        if(temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
        } else {
            for(int i=index; i<nums.length; i++) {
                if(i == index || nums[i] != nums[index]) {
                    swap(nums,i,index);
                    temp.add(nums[index]);
                    permute(result,temp,nums,index+1);
                    temp.remove(temp.size() - 1);
                    swap(nums,i,index);
                }
            }
        }
    }
    private void swap(int[] array,int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3};
        System.out.println(new Solution().permute(array));
    }

}
