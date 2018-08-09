package com.myhexin.swordOffice;
/*
 * 
 * ����һ��������ת�����������������Ԫ�ء�
 */
public class ReverseList {
	public ListNode reverseList(ListNode head) {
		ListNode reverseListHead = null;
		ListNode node = head;
		ListNode prev = null;
		while(node != null) {
			ListNode next = node.next;
			if(next == null) 
				reverseListHead = node;
			node.next = prev;
			
			prev = node;
			node = next;
		}
		return reverseListHead;
	}
}
