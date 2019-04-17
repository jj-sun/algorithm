package com.algorithm.code_101;

import com.algorithm.TreeNode;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 说明:
 *
 * 如果你可以运用递归和迭代两种方法解决这个问题，会很加分。
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode l1,TreeNode l2) {
        if(l1 == null && l2 == null) {
            return true;
        }
        if(l1== null || l2 == null) {
            return false;
        }

        return (l1.val == l2.val) && isMirror(l1.left,l2.right) && isMirror(l1.right,l2.left);
    }
}
