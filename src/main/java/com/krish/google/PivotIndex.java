package com.krish.google;

public class PivotIndex {

	public static void main(String[] args) {

		int[] nums = { 1, 7, 3, 6, 5, 6 };
		System.out.println(pivotIndex(nums));

		int[] nums1 = { 1, 2, 3 };
		System.out.println(pivotIndex(nums1));
	}

	public static int pivotIndex(int[] nums) {
		int total = 0;
		int left = 0;

		for (int num : nums)
			total += num;

		for (int i = 0; i < nums.length; i++) {

			if (i > 0)
				left += nums[i - 1];

			int right = total - left - nums[i];
			if (left == right)
				return i;

		}

		return -1;
	}

}
