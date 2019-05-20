package com.algorithm.code_1_50.code_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1:
 *
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 */
public class Solution {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum(result,new ArrayList<>(),candidates,target,0);
        return result;
    }

    private void combinationSum(List<List<Integer>> result,List<Integer> temp,int[] candidates,int target,int num) {
        if(target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target < candidates[0]) {
            return ;
        }
        for(int i=num; i<candidates.length && target >= candidates[i]; i++) {
            temp.add(candidates[i]);
            combinationSum(result,temp,candidates,target-candidates[i],i);
            temp.remove(temp.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] array = new int[] {2,5,2,1,2};
        System.out.println(new Solution().combinationSum(array,5));
    }

}
