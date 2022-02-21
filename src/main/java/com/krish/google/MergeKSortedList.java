package com.krish.google;

import java.util.PriorityQueue;

//https://leetcode.com/problems/merge-k-sorted-lists/submissions/
//https://www.youtube.com/watch?v=kpCesr9VXDA
public class MergeKSortedList {

	private ListNode head;
	
	public static void main(String[] args) {
		MergeKSortedList one = new MergeKSortedList();
		one.head = new ListNode(1);
		
		MergeKSortedList two = new MergeKSortedList();
		two.head = new ListNode(1);
		
		print(mergeKSprtedList(null));
		
	}
	
	public static void print(ListNode head) {
		while(null != head.next) {
			System.out.println(head.val + " -> ");
			head = head.next;
		}
		
		System.out.println();
	}
	
	public static ListNode mergeKSprtedList(ListNode[] lists) {
		if(null == lists || lists.length == 0)
			return null;
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		for(ListNode node : lists) {
			minHeap.add(node.val);
		}
		
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		
		while(!minHeap.isEmpty()) {
			head.next = new ListNode(minHeap.remove());
			head = head.next;
		}
		
		return dummy.next;
	}

}
