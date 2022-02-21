package com.krish.google;

//https://www.youtube.com/watch?v=R6-PnHODewY
//https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/
public class RemoveDuplicatesFromSortedList {

	private ListNode head;
	
	public static void main(String[] args) {

		RemoveDuplicatesFromSortedList node = new RemoveDuplicatesFromSortedList();
		node.head = new ListNode(1);
		ListNode first = new ListNode(2);
		ListNode second = new ListNode(3);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(4);
		ListNode sixth = new ListNode(5);
		
		node.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = null;
		
		node.print(node.head);
		node.deleteDuplicates(node.head);
		node.print(node.head);
		
		
	}
	
	public void print(ListNode head) {
		while(null != head) {
			System.out.print(head.val + " -> ");
			head = head.next;
		}
			
		
		System.out.println();
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummy = new ListNode(0, head);
		ListNode prev = dummy;
		
		while(null != head) {
			
			if(null != head.next && head.val == head.next.val) {
				
				while(null != head.next && head.val == head.next.val) {
					head = head.next;
				}
				
				prev.next = head.next;
			} else {
				prev = prev.next;
			}
			
			head = head.next;
		}
		
		return dummy.next;
	}

}

