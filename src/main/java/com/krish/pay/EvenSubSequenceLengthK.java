package com.krish.pay;

import java.util.Arrays;

//https://www.geeksforgeeks.org/maximum-even-sum-subsequence-of-length-k/
//https://leetcode.com/discuss/interview-question/887040/microsoft-oa-2020-max-even-sum-of-a-subsequence-of-length-k
public class EvenSubSequenceLengthK {

	public static void main(String[] args) {
		int nums[] = { 4, 2, 6, 7, 8 };
		System.out.println(solution(nums, 3));

		int nums1[] = { 5, 5, 1, 1, 3 };
		System.out.println(solution(nums1, 3));

		//A = [5, 5, 2, 4, 3], K = 3, the algorithm should return 14 as 5 + 5 + 4 = 14
		int nums2[] = { 5, 5, 2, 4, 3 };
		System.out.println(solution(nums2, 3));
	}

	//O(nlogn)
	public static int solution(int[] arr, int k) {
		Arrays.sort(arr);

		int found = 1;
		int sum = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {
			if (found == k)
				return sum;

			if ((sum + arr[i]) % 2 == 0) {
				sum += arr[i];
				found++;
			}
		}

		return -1;
	}
}
