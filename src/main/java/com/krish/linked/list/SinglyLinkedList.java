package com.krish.linked.list;

public class SinglyLinkedList {
	
	private ListNode head;

	public static void main(String[] args) {

		SinglyLinkedList sll = new SinglyLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(6);
		ListNode third = new ListNode(4);
		ListNode fourth = new ListNode(1);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display(sll.head);
		System.out.println("Length = " + sll.length());
		
		sll.addFirst(5);
		sll.display(sll.head);
		
		sll.addFirst(8);
		sll.display(sll.head);
		
		sll.addLast(19);
		sll.display(sll.head);
		
		sll.addLast(9);
		sll.display(sll.head);
		
		ListNode middelNode = sll.middleNode(sll.head);
		System.out.println("Middle Node = " + middelNode.data);
		
		System.out.println(sll.searchData(19));
		System.out.println(sll.searchData(190));
		
		int number = 2;
		ListNode nthNodeFromLast = sll.nthNodeFromLast(number);
		System.out.println(number + " Node from the last is = " + nthNodeFromLast.data);
		
		int number1 = 4;
		ListNode nthNodeFromLast1 = sll.nthNodeFromLast(number1);
		System.out.println(number + " Node from the last is = " + nthNodeFromLast1.data);
		
		ListNode reverse = sll.reverse(sll.head);
		sll.display(reverse);
		
		SinglyLinkedList sll1 = new SinglyLinkedList();
		sll1.head = new ListNode(1);
		ListNode second1 = new ListNode(8);
		ListNode third1 = new ListNode(11);
		ListNode fourth1 = new ListNode(16);
		sll1.head.next = second1;
		second1.next = third1;
		third1.next = fourth1;


		sll1.display(sll1.head);
		ListNode resultHead = sll1.insertNodeSortedSinglyLinkedList(10);
		sll1.display(resultHead);
		
		sll1.removeKey(16);
		sll1.display(sll1.head);
	}
	
	public void addFirst(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int value) {
		ListNode newNode = new ListNode(value);
		
		if(null == head) {
			head = newNode;
			return;
		}
		
		ListNode current = head;
		while(null != current.next) {
			current = current.next;
		}
	
		current.next = newNode;
	}
	
	public boolean searchData(int data) {
		if(null == head)
			return false;
		
		ListNode current = head;
		while(null != current) {
			
			if(current.data == data)
				return true;
			
			current = current.next;
		}
		
		return false;
	}
	
	public ListNode reverse(ListNode head) {
		if(null == head)
			return head;
		
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		
		while(null != current) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
	}
	
	public ListNode middleNode(ListNode head) {
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		
		while(null != fastPointer && null != fastPointer.next) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		
		return slowPointer;
	}
	
	public ListNode nthNodeFromLast(int number) {
		if(null == head)
			return null;
		
		if(number <= 0)
			throw new IllegalArgumentException("Invalid value = " + number);
		
		ListNode mainPointer = head;
		ListNode refPointer = head;
		int count = 0;
		
		while(count < number) {
			refPointer = refPointer.next;
			count++;
		}
		
		while(null != refPointer) {
			refPointer = refPointer.next;
			mainPointer = mainPointer.next;
		}
		
		return mainPointer;
	}
	
	public ListNode insertNodeSortedSinglyLinkedList(int value) {
		ListNode newNode = new ListNode(value);
		
		if(null == head)
			return newNode;
		
		ListNode current = head;
		ListNode temp = head;
		
		while(null != current && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		
		newNode.next = current;
		temp.next = newNode;
		
		return head;
	}
	
	public void removeKey(int data) {
		ListNode current = head;
		ListNode temp = head;
		
		if(current != null && current.data == data) {
			head = current.next;
			return;
		}
		
		while(null != current && data != current.data) {
			temp = current;
			current = current.next;
		}
		
		if(null == current)
			return;
		
		temp.next = current.next;
	}
	
	public void display(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		
		System.out.print("null");
		System.out.println();
	}
	
	public int length() {
		ListNode current = head;
		int count = 0;
		
		if(current == null)
			return count;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		
		return count;
	}
	
	private static class ListNode {
		
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

}
