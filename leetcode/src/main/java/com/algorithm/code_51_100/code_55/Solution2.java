package com.algorithm.code_51_100.code_55;

public class Solution2 {

    Index[] memo;

    /**
     * 自底向上
     * @param nums
     * @return
     */
    public boolean canJump1(int[] nums) {
        memo = new Index[nums.length];
        for(int i=0; i<memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length-1] = Index.GOOD;

        for(int i = nums.length - 2; i >= 0 ; i--) {
            int furthestJump = Math.min(i + nums[i],nums[nums.length-1]);
            for(int j = i+1; j<=furthestJump ;j++) {
                if(memo[j] == Index.GOOD) {
                    memo[i] = Index.GOOD;
                    break;
                }
            }
        }
        return memo[0] == Index.GOOD;
    }

    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        for(int i=0; i<memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length-1] = Index.GOOD;
        return canJumpFromPosition(0,nums);
    }

    /**
     * 自顶向下
     * @param position
     * @param nums
     * @return
     */
    private boolean canJumpFromPosition(int position, int[] nums) {
        if(memo[position] != Index.UNKNOWN) {
            return memo[position] == Index.GOOD;
        }

        int furthestJump = Math.min(position + nums[position],nums[nums.length-1]);
        for(int nextPosition = position + 1; nextPosition <= furthestJump; nextPosition++) {
            if(canJumpFromPosition(nextPosition,nums)) {
                memo[position] = Index.GOOD;
                return true;
            }
        }

        memo[position] = Index.BAD;
        return false;
    }




}
enum Index {
    GOOD,BAD,UNKNOWN
}
