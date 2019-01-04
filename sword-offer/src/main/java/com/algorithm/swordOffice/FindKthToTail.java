package com.algorithm.swordOffice;

public class FindKthToTail {
	 public ListNode findKthToTail(ListNode head,int k) {
		 if(head == null || k == 0) return null;
		 ListNode first = head;
		 ListNode second = null;
		 for(int i=0; i<k-1; i++) {
			 if(first.next != null)
				 first = first.next;
			 else
				 return null;
		 }
		 second = head;
		 while(first.next != null) {
			 first = first.next;
			 second = second.next;
		 }
		 return second;
	 }
}
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/