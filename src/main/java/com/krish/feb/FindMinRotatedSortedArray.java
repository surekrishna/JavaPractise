package com.krish.feb;

public class FindMinRotatedSortedArray {

	public static void main(String[] args) {

		int[] nums = { 3, 4, 5, 1, 2 };
		System.out.println(findMin(nums));

		int[] nums1 = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findMin(nums1));

		int[] nums2 = { 11, 13, 15, 17 };
		System.out.println(findMin(nums2));

		int[] nums3 = { 4, 4, 4, 4, 4 };
		System.out.println(findMin(nums3));
		
		int[] nums4 = { 3, 4, 1, 2, 5 };
		System.out.println(findMin(nums4));
	}

	public static int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = (left + right) / 2;

			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}

		return nums[left];
	}

}
