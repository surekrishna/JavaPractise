package com.krish.iq;

//https://www.youtube.com/watch?v=KVf1Uuqfv8E
public class MergeTwoSortedList {
	
	static void printList(ListNode head)
	{
	    ListNode temp = head;
	    while (temp != null)
	    {
	        System.out.print(temp.val + " ");
	        temp = temp.next;
	    }
	    System.out.println();
	}

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(10);
		l1.next.next = new ListNode(15);
		l1.next.next.next = new ListNode(17);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(15);
		l2.next.next.next = new ListNode(20);
		
	    
	    ListNode head = mergeTwoSortedList(l1, l2);
	    printList(head);
	    
	}

	public static ListNode mergeTwoSortedList(ListNode l1, ListNode l2) {

		ListNode tempNode = new ListNode(0);
		ListNode currNode = tempNode;

		while (null != l1 && null != l2) {
			if (l1.val < l2.val) {
				currNode.next = l1;
				l1 = l1.next;
			} else {
				currNode.next = l2;
				l2 = l2.next;
			}

			currNode = currNode.next;
		}

		if (null != l1) {
			currNode.next = l1;
			l1 = l1.next;
		}

		if (null != l2) {
			currNode.next = l2;
			l2 = l2.next;
		}

		return tempNode.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}