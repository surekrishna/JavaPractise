package com.krish.feb;

//https://leetcode.com/problems/monotonic-array/
//https://leetcode.com/problems/monotonic-array/discuss/1738743/Easy-1ms-and-faster-then-100-submission
public class MonotonicArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3 };
		System.out.println(isMonotonic(nums));
		
		int[] nums1 = { 6, 5, 4, 4 };
		System.out.println(isMonotonic(nums1));
		
		int[] nums2 = { 1, 3, 2 };
		System.out.println(isMonotonic(nums2));
	}

	public static boolean isMonotonic(int[] nums) {
		boolean increment = true;
		boolean decrement = true;
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				increment = false;
			}
			
			if(nums[i] < nums[i+1]) {
				decrement = false;
			}
			
			if(!( increment || decrement)) {
				return false;
			}
				
		}

		return increment || decrement;
	}

}
