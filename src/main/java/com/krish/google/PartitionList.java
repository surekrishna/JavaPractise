package com.krish.google;

//https://leetcode.com/problems/partition-list/
public class PartitionList {
	
	private ListNode head;

	public static void main(String[] args) {
		
		PartitionList pList = new PartitionList();
		pList.head = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(2);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(2);
		pList.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;

		System.out.println("Elements Before ");
		pList.print(pList.head);
		
		System.out.println("Elements After ");
		ListNode partionList = pList.partitionList(pList.head, 3);
		pList.print(partionList);

	}
	
	public void print(ListNode head) {
		ListNode current = head;
		if(current == null)
			return;
		
		while(null != current) {
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		
		System.out.println();
	}

	public ListNode partitionList(ListNode head, int x) {
		if(null == head)
			return head;
		
		ListNode dummy1 = new ListNode(0);
		ListNode dummy2 = new ListNode(0);
		ListNode curr1 = dummy1;
		ListNode curr2 = dummy2;
		
		while(null != head) {
			
			if(head.val < x) {
				curr1.next = head;
				curr1 = head;
			} else {
				curr2.next = head;
				curr2 = head;
			}
			
			head = head.next;
		}
		
		curr2.next = null;
		curr1.next = dummy2.next;
		
		return dummy1.next;
	}
}

class ListNode {
	
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
