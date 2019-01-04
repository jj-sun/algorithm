package com.algorithm;

/**
 * Hello world!
 *
 */
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 */
public class App
{
    public static void main( String[] args )
    {
        int[] res = twoSum1(new int[]{2,7,11,15},9);
        System.out.println(res[0]+ ":" + res[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int res = target - nums[i];
            if(map.containsKey(res)) {
                return new int[] {map.get(res),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 假如数组是升序的有以下方法
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int res = nums[start] + nums[end];
            if(res > target) {
                end --;
            }else if(res < target) {
                start++;
            }else {
                return new int[] {start+1,end+1};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}