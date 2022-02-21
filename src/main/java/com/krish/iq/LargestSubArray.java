package com.krish.iq;

//https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
public class LargestSubArray {

	public static void main(String[] args) {

		int[] nums = new int[]{-4, 2, -1, 1, 2, 3, 6, -5, 1};
		System.out.println("Largest Sum = " + largestSubArray(nums));
		
		int[] nums1 = new int[]{4, 2, -5, -1, -2, -3, 6, -5, 1};
		System.out.println("Largest Sum = " + largestSubArray(nums1));
	}
	
	public static int largestSubArray(int[] nums) {
		int length = nums.length;
		if(length < 1)
			return 0;
		
		int currentMax = 0;
		int globalMax = Integer.MIN_VALUE;
		
		for(int i = 0; i < length; i++) {
			currentMax += nums[i];
			
			if(globalMax < currentMax) {
				globalMax = currentMax;	
			}
			
			if(nums[i] < 0) {
				currentMax = 0;
			}
			
		}
		
		return globalMax;
	}

}

