package com.algorithm.code_51_100.code_83;

import com.algorithm.common.ListNode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        while(p != null && p.next != null) {
            if(p.val == p.next.val) {
                ListNode tmp = p.next;
                p.next = p.next.next;
                tmp.next = null;
            }else {
                p = p.next;
            }
        }
        return head;
    }

}
