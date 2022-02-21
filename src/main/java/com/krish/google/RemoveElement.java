package com.krish.google;

public class RemoveElement {

	public static void main(String[] args) {

		int[] nums1 = {3, 2, 2, 3};
		System.out.println("Size is = " + removeElement(nums1, 3));
		
		int[] nums2 = {0,1,2,2,3,0,4,2};
		System.out.println("Size is = " + removeElement(nums2, 2));
		
	}

	public static int removeElement(int[] nums, int val) {
		int count = 0;
		
		for(int i = 0; i < nums.length; i++)
			if(nums[i] != val)
				nums[count++] = nums[i];
		
		return count;
	}

}
