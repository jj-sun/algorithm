package com.algorithm.code_22;

public class Solution {
    public int removeElement(int[] nums, int val) {
       int i=0;
       for(int j=0; j<nums.length; j++) {
           if(nums[j] != val) {
               nums[i] = nums[j];
               i++;
           }
       }
       return i;
    }

    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        System.out.println(new Solution().removeElement(nums,2));
        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
