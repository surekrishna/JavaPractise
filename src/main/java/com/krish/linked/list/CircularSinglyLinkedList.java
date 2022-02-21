package com.krish.linked.list;

//https://www.youtube.com/watch?v=0ODSrJcMT54
//https://www.youtube.com/watch?v=xwvZYAsvY1A
//https://www.youtube.com/watch?v=PGvXsUew2IM
//https://www.youtube.com/watch?v=XtkXUcn8IH8
public class CircularSinglyLinkedList {

	private int length;
	private ListNode last;
	
	private class ListNode {
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public CircularSinglyLinkedList() {
		this.last = null;
		this.length = 0;
	}
	
	public int getSize() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void createCircularSinglyLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(7);
		ListNode fourth = new ListNode(9);
		
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		
		this.last = fourth;
	}
	
	public void printCircularSinglyLinkedList() {
		if(null == this.last)
			return;
		
		ListNode first = this.last.next;
		while(first != this.last) {
			System.out.print(first.data + " ");
			first = first.next;
		}
		
		System.out.print(first.data + " ");
		System.out.println();
	}
	
	public void addFirst(int data) {
		ListNode temp = new ListNode(data);
		
		if(null == this.last) {
			this.last = temp;
		} else {
			temp.next = this.last.next;
		}
		
		this.last.next = temp;
		length++;
	}
	
	public void addLast(int data) {
		ListNode temp = new ListNode(data);
		
		if(null == this.last) {
			this.last = temp;
			this.last.next = this.last;
		} else {
			temp.next = this.last.next;
			this.last.next = temp;
			this.last = temp;
		}
		
		length++;
	}
	
	public void removeFirst() throws Exception {
		if(isEmpty())
			throw new Exception("List is Empty!");
		
		ListNode temp = this.last.next;
		
		if(this.last.next == this.last) {
			this.last = null;
		}else {
			this.last.next = temp.next;
		}
		
		temp.next = null;
		length--;
	}
	
	public static void main(String[] args) throws Exception {

		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCircularSinglyLinkedList();
		csll.printCircularSinglyLinkedList();
		csll.addFirst(3);
		csll.printCircularSinglyLinkedList();
		csll.addLast(6);
		csll.printCircularSinglyLinkedList();
		csll.removeFirst();
		csll.printCircularSinglyLinkedList();
		
	}

}
