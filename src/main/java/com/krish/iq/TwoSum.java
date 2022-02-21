package com.krish.iq;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//https://leetcode.com/problems/two-sum/submissions/
//https://www.code-recipe.com/post/two-sum
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/discuss/1755811/very-easy-Java-Solution
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 12, 17 };
		System.out.println(Arrays.toString(twoSum(nums, 14)));

		System.out.println(twoSum1(nums, 14));
		System.out.println(twoSum1(nums, 10));
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];

		for (int i = 0; i < nums.length; i++) {
			Integer requiredNum = target - nums[i];

			if (map.containsKey(requiredNum)) {
				result[0] = i;
				result[1] = map.get(requiredNum);
				Arrays.sort(result);
				return result;
			}

			map.put(nums[i], i);
		}

		return result;
	}

	public static boolean twoSum1(int[] nums, int target) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (set.contains(target - num))
				return true;

			set.add(num);
		}

		return false;
	}

}
