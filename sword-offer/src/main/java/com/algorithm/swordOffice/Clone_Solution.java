package com.algorithm.swordOffice;

public class Clone_Solution {
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead == null)
			return null;
		//��һ�� ��������
		RandomListNode pNode = pHead;
		while(pNode != null) {
			RandomListNode pCloned = new RandomListNode(pNode.label);
			pCloned.next = pNode.next;
			pCloned.random = null;
			pNode.next = pCloned;
			pNode = pCloned.next;
			
		}
		
		//�ڶ��� ����
		RandomListNode pNodeC = pHead;
		while(pNodeC != null) {
			RandomListNode pCloned = pNodeC.next;
			if(pNodeC.random != null)
				pCloned.random = pNodeC.random.next;
			pNodeC = pCloned.next;
		}
		
		//������ ����
		pNode = null;
		pNode = pHead;
		RandomListNode pClonedHead = null;
		RandomListNode pClonedNode = null;
		if(pNode != null) {
			pClonedHead = pNode.next;
			pClonedNode = pNode.next;
			pNode.next = pClonedNode.next;
			pNode = pNode.next;
		}
		while(pNode != null) {
			pClonedNode.next = pNode.next;
			pClonedNode = pClonedNode.next;
			pNode.next = pClonedNode.next;
			pNode = pNode.next;
		}
		return pClonedHead;
	}
}
