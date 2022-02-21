package com.krish.google;

public class RemoveDuplicatesFromLinkedList {

	private ListNode head;

	public static void main(String[] args) {
		RemoveDuplicatesFromLinkedList list = new RemoveDuplicatesFromLinkedList();
		list.head = new ListNode(1);
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(3);

		list.head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		list.print(list.head);
		
		list.deleteDuplicates(list.head);
		list.print(list.head);
	}

	public void print(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		
		System.out.print("null");
		System.out.println();
	}

	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		
		if(null == current || null == current.next)
			return head;
		
		while(null != current.next) {
			if(current.val == current.next.val)
				current.next = current.next.next;
			else
				current = current.next;
		}
		
		return head;
	}

}
