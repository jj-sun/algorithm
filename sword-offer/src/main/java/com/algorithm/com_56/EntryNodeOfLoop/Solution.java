package com.algorithm.com_56.EntryNodeOfLoop;

import com.algorithm.swordOffice.ListNode;

public class Solution {
	
	public ListNode MeetingNode(ListNode pHead) {
		if(pHead == null) return null;
		ListNode pSlow = pHead.next;
		if(pSlow == null) return null;
		ListNode pFast = pSlow.next;
		while(pSlow != null && pFast != null) {
			if(pSlow == pFast)
				return pSlow;
			pSlow = pSlow.next;
			
			pFast = pFast.next;
			if(pFast.next != null)
				pFast = pFast.next;
		}
		return null;
	}
	public ListNode EntryNodeOfLoop(ListNode pHead) {
		ListNode meeting = MeetingNode(pHead);
		if(meeting == null) return null;
		
		ListNode pNode1 = meeting;
		int loopLength = 1;
		while(pNode1.next != meeting) {
			pNode1 = pNode1.next;
			loopLength++;
		}
		
		pNode1 = pHead;
		ListNode pNode2 = pHead;
		
		for(int i=0; i<loopLength; i++) 
			pNode1 = pNode1.next;
		
		while(pNode1 != pNode2) {
			pNode1 = pNode1.next;
			pNode2 = pNode2.next;
		}
		
		return pNode1;
		
	}
}
