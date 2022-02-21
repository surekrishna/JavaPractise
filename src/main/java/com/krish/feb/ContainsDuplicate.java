package com.krish.feb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/contains-duplicate/
//https://leetcode.com/problems/contains-duplicate/discuss/1753519/java-very-easy-solution-using-hashset
public class ContainsDuplicate {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate(nums));

		int[] nums1 = { 1, 2, 3, 4 };
		System.out.println(containsDuplicate(nums1));

		int[] nums2 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicate(nums2));
		
		System.out.println();
		
		int[] nums3 = { 1, 2, 3, 1 };
		System.out.println(containsDuplicate1(nums3));

		int[] nums4 = { 1, 2, 3, 4 };
		System.out.println(containsDuplicate1(nums4));

		int[] nums5 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		System.out.println(containsDuplicate1(nums5));
	}

	public static boolean containsDuplicate(int[] nums) {
		boolean iscontainsDuplicate = false;
		Set<Integer> set = new HashSet<>();

		for (Integer i : nums) {
			if (!set.add(i)) {
				return !iscontainsDuplicate;
			}
		}

		return iscontainsDuplicate;
	}
	
	public static boolean containsDuplicate1(int[] nums) {
		List<Integer> list = Arrays.stream(nums).boxed().toList();
		Set<Integer> set = new HashSet<>();

		return list.stream().filter(n -> !set.add(n)).count() > 0;

	}

}
