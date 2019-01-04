package com.algorithm.swordOffice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedList {

	public static void main(String[] args) {
		ListNode listNode = new ListNode(0);
		listNode.next = null;
		ListNode p = listNode;
		for(int i=1; i<=5; i++) {
			ListNode list = new ListNode(i);
			list.next = null;
			p.next = list;
			p = list;
		}
		ListNode q = listNode;
		while(q != null) {
			System.out.print(q.val);
			q = q.next;
		}
		System.out.println();
		ArrayList<Integer> l = printListFromTailToHead(listNode);
		Iterator<Integer> ite = l.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode p = listNode;
		while(p != null) {
			list.add(p.val);
			p = p.next;
		}
		Collections.reverse(list);
        return list;
    }
}

