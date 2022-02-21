package com.krish.iq;

//https://www.geeksforgeeks.org/find-first-and-last-positions-of-an-element-in-a-sorted-array/
//https://www.educative.io/m/find-low-high-index
public class ArrayLowHighIndex {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6 };
		lowHighNativeApproach(nums, 1);
		lowHighNativeApproach(nums, 4);
		lowHighNativeApproach(nums, 7);
		
		System.out.println("Low index = " + findLowIndex(nums, 6) + " High index = " + findHighIndex(nums, 6));
		System.out.println("Low index = " + findLowIndex(nums, 8) + " High index = " + findHighIndex(nums, 8));
		System.out.println("Low index = " + findLowIndex(nums, 3) + " High index = " + findHighIndex(nums, 3));

	}
	
	public static void lowHighNativeApproach(int[] nums, int key) {
		int first = -1;
		int last = -1;
		
		for(int i = 0; i < nums.length; i++) {
			if(key != nums[i])
				continue;
			else if (first == -1)
				first = i;
			
			last = i;
		}
		
		if(first != -1)
			System.out.println("First index = " + first + " Last index = " + last);
		else
			System.out.println("Not found!");
	}
	
	//binary search O(log n)
	public static int findLowIndex(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if(nums[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
			
		}
		
		if(low < nums.length && nums[low] == key)
			return low;
		
		return -1;
	}
	
	//binary search O(log n)
	public static int findHighIndex(int[] nums, int key) {
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
			
			if(nums[mid] <= key)
				low = mid + 1;
			else
				high = mid - 1;
			
		}
		
		if(high == -1)
			return high;
		
		if(high < nums.length && nums[high] == key)
			return high;
		
		return -1;
	}

}
