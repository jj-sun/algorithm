package com.algorithm.com_37.FindFirstCommonNode;

import com.algorithm.swordOffice.ListNode;

/*
public class ListNode {
    int val;
    ListNode next = nul
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		int length1 = getListLength(pHead1);
		int length2 = getListLength(pHead2);
		int nLengthDif = length1 - length2;
		ListNode pListLong = pHead1;
		ListNode pListShort = pHead2;
		if(length2 > length1) {
			pListLong = pHead2;
			pListShort = pHead1;
			nLengthDif = length2 - length1;
		}
		
		for(int i=0; i<nLengthDif; i++) {
			pListLong = pListLong.next;
		}
		
		while(pListLong != null && pListShort != null && pListLong != pListShort) {
			pListLong = pListLong.next;
			pListShort = pListShort.next;
		}
		ListNode pFirstCommonNode = pListLong;
		return pFirstCommonNode;
	}
	public int getListLength(ListNode pHead) {
		if(pHead == null) return 0;
		ListNode p = pHead;
		int count = 0;
		while(p != null) {
			++count;
			p = p.next;
		}
		return count;
	}
}
