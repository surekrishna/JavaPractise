package com.krish.google;

public class AddTwoNumbers {

	private ListNode head;

	public static void main(String[] args) {

		AddTwoNumbers addTwo1 = new AddTwoNumbers();
		addTwo1.head = new ListNode(2);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(3);
		addTwo1.head.next = second;
		second.next = third;

		AddTwoNumbers addTwo2 = new AddTwoNumbers();
		addTwo2.head = new ListNode(5);
		ListNode second1 = new ListNode(6);
		ListNode third1 = new ListNode(4);
		addTwo2.head.next = second1;
		second1.next = third1;
		
		
		PartitionList pList = new PartitionList();
		pList.print(addTwoNumbers(addTwo1.head, addTwo2.head));
		
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode dummy = new ListNode(0);
		ListNode p = dummy;
		
		while(l1 != null || l2 != null || carry != 0) {
			
			if(l1 != null) {
				carry += l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null) {
				carry += l2.val;
				l2 = l2.next;
			}
			
			p.next = new ListNode(carry%10);
			carry /= 10;
			p = p.next;
		}
		
		return dummy.next;
	}

}
