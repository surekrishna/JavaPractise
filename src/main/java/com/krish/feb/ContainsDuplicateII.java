package com.krish.feb;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/contains-duplicate-ii/
public class ContainsDuplicateII {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsNearbyDuplicate(nums, 3));

		int[] nums1 = { 1, 0, 1, 1 };
		System.out.println(containsNearbyDuplicate(nums1, 1));

		int[] nums2 = { 1, 2, 3, 1, 2, 3 };
		System.out.println(containsNearbyDuplicate(nums2, 2));

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		boolean isContainNearbyDuplicate = false;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			Integer num = nums[i];
			if (map.containsKey(num) && Math.abs(map.get(num) - i) <= k) {
				return !isContainNearbyDuplicate;
			}
			
			map.put(num, i);
		}

		return isContainNearbyDuplicate;
	}

}
