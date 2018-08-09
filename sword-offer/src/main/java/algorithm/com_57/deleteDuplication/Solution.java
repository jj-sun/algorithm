package com.myhexin.com_57.deleteDuplication;

import com.myhexin.swordOffice.ListNode;

public class Solution {
	public ListNode deleteDuplication(ListNode pHead) {
		if(pHead == null)
			return null;
		
		ListNode preNode = null;
		ListNode pNode = pHead;
		while(pNode != null) {
			ListNode pNext = pNode.next;
			boolean needDelete = false;
			if(pNext != null && pNext.val == pNode.val) 
				needDelete = true;
			if(!needDelete) {
				preNode = pNode;
				pNode = pNode.next;
			}else {
				int value = pNode.val;
				ListNode pToBeDel = pNode;
				while(pToBeDel != null && pToBeDel.val == value) {
					pNext = pToBeDel.next;
					pToBeDel = null;
					pToBeDel = pNext;
				}
				
				if(preNode == null)
					pHead = pNext;
				else 
					preNode.next = pNext;
				
				pNode = pNext;
				
			}
		}
		
		return pHead;
	}
}
