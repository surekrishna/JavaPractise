package com.krish.iq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/3sum/submissions/
//https://youtu.be/nZyzf4ZxHWA
public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums));
		
		int[] nums1 = {};
		System.out.println(threeSum(nums1));
		
		int[] nums2 = {0};
		System.out.println(threeSum(nums2));
		
		int[] nums3 = {0, 0, 0, 0};
		System.out.println(threeSum(nums3));
		
		int[] nums4 = {-1, 0, 1, 0};
		System.out.println(threeSum(nums4));
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		int length = nums.length;
		if(length < 3)
			return new ArrayList<>();
		
		Arrays.sort(nums);

		Set<List<Integer>> result = new HashSet<>();
		for(int i = 0; i < length - 2; i++) {
			int j = i + 1;
			int k = length - 1;
			
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				
				if(sum == 0) {
					result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
				} else if (sum > 0) {
					k--; 
				} else {
					j++;
				}
			}
		}
		
		return new ArrayList<>(result);
	}

}
