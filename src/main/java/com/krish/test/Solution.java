package com.krish.test;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int nums[] = { 4, 2, 6, 7, 8 };
		System.out.println(solution(nums, 3));

		int nums1[] = { 5, 5, 1, 1, 3 };
		System.out.println(solution(nums1, 3));

		int nums2[] = { 5, 5, 2, 4, 3 };
		System.out.println(solution(nums2, 3));
	}

	public static int solution(int[] arr, int k) {
		Arrays.sort(arr);

		int found = 1;
		int sum = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (found == k)
				break;

			if ((sum + arr[i]) % 2 == 0) {
				sum += arr[i];
				found++;
			}
		}

		return found == k ? sum : -1;
	}
}
