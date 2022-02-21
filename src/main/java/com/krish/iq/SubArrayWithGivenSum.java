package com.krish.iq;

import java.util.HashMap;

//https://leetcode.com/problems/subarray-sum-equals-k/
//https://www.udemy.com/course/leetcode-questions-solutions-explained-8/learn/lecture/23757830?start=0#overview
public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };

		subarraySum(arr, 0);
		
		System.out.println(subarraySum1(arr, 7));
		
		int[] arr1 = { 1, 1, 1 };		
		System.out.println(subarraySum1(arr1, 2));

	}

	public static void subarraySum(int[] arr, int k) {
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			int currSum = 0;

			for (int j = i; j < length; j++) {
				currSum += arr[j];
				if (currSum == k) {
					System.out.println("Sub Array indexes :: " + i + " " + j);
					System.out.println("Sub Array Numbers :: ");
					printSubArray(arr, i, j);
				}
			}
		}
	}

	public static int subarraySum1(int[] nums, int k) {
		int count = 0;
		int sum = 0;

		HashMap<Integer, Integer> sumOccurrencesMap = new HashMap<>();
		sumOccurrencesMap.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			
			//sumEnd = sumStart + k => sumStart = sumEnd - k
			int need = sum - k;
			if(sumOccurrencesMap.containsKey(need))
				count += sumOccurrencesMap.get(need);
			
			sumOccurrencesMap.put(sum, sumOccurrencesMap.getOrDefault(sum, 0) + 1);
		}

		return count;
	}

	private static void printSubArray(int[] numbers, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(numbers[i] + " ");
		}

		System.out.println();
	}

}
