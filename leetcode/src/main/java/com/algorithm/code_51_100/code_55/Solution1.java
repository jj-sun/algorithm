package com.algorithm.code_51_100.code_55;

/**
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个位置。
 *
 * 示例 1:
 *
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 从位置 0 到 1 跳 1 步, 然后跳 3 步到达最后一个位置。
 * 示例 2:
 *
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 */

public class Solution1 {

    public boolean canJump(int[] nums) {
        return canJumpFromPosition(0,nums);
    }

    /**
     * 回溯法
     * @param position 下一个位置
     * @param nums 数组
     * @return 是否能够到达
     */
    private boolean canJumpFromPosition(int position, int[] nums) {
        if(position == nums.length - 1) {
            return true;
        }
        int furthestJump = Math.min(position + nums[position],nums[nums.length-1]);
        for(int nextPosition = position + 1 ; nextPosition <= furthestJump; nextPosition ++) {
            if(canJumpFromPosition(nextPosition,nums)) {
                return true;
            }
        }
        return false;
    }

}
