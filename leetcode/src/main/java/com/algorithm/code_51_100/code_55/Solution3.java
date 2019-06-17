package com.algorithm.code_51_100.code_55;

/**
 * 贪心算法
 */
public class Solution3 {

    public boolean canJump(int[] nums) {
        int lastPos = nums.length - 1;

        for(int i = nums.length - 2; i>=0; i-- ) {
            if(i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }

}
