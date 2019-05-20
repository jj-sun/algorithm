package com.algorithm.code_1_50.code_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的每个数字在每个组合中只能使用一次。
 *
 * 说明：
 *
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。
 * 示例 1:
 *
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,5,2,1,2], target = 5,
 * 所求解集为:
 * [
 *   [1,2,2],
 *   [5]
 * ]
 */
public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(result,new ArrayList<>(),candidates,target,0);
        return result;
    }
    private void combinationSum2(List<List<Integer>> result,List<Integer> temp,int[] candidates, int target,int index) {

        if(target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target < candidates[0]) {
            return;
        }

        for(int i=index; i < candidates.length && candidates[i] <= target; i++) {
            if(i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            temp.add(candidates[i]);
            combinationSum2(result,temp,candidates,target - candidates[i],i+1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] {10,1,2,7,6,1,5};
        System.out.println(new Solution().combinationSum2(array,8));
    }

}
