package com.myhexin.swordOffice;
/*
 *���������������������������������ϳɺ������
 *��Ȼ������Ҫ�ϳɺ���������㵥���������� 
 */
public class Merge {
	 public ListNode merge(ListNode list1,ListNode list2) {
	        if(list1 == null) 
	        	return list2;
	        else if(list2 == null)
	        	return list1;
	        ListNode mergeHead = null;
	        if(list1.val < list2.val) {
	        	mergeHead = list1;
	        	mergeHead.next = merge(list1.next, list2);
	        }else {
	        	mergeHead = list2;
	        	mergeHead.next = merge(list1, list2.next);
	        }
	        return mergeHead;
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