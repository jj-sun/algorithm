package com.algorithm.code_1_100.code_19;

import com.algorithm.common.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head,q = head;
        boolean isLastNode = false;
        for (int i=0; i<n; i++) {
            q = q.next;
            if(q == null) {
                isLastNode = true;
                break;
            }
        }
        if(isLastNode) {
            head = head.next;
        }else {
            while(q.next != null) {
                q = q.next;
                p = p.next;
            }
            p.next = p.next.next;

        }
        return head;
    }
}
