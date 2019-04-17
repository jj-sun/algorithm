package com.algorithm.code_21;

import com.algorithm.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, curr = head;
        while (p != null && q != null) {
            if (p.val > q.val) {
                curr.next = q;
                q = q.next;
            } else {
                curr.next = p;
                p = p.next;
            }
            curr = curr.next;
            curr.next = null;
        }
        //任意一条为空，则直接链接另一条
        if(p == null) {
            curr.next = q;
        }
        if(q == null) {
            curr.next = p;
        }
        return head.next;
    }
}
