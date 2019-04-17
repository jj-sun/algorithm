package com.algorithm.code_1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int res = target - nums[i];
            if(map.containsKey(res)) {
               return new int[] {map.get(res),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
