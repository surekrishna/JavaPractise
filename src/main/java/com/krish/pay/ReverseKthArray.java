package com.krish.pay;

import java.util.Arrays;

//https://www.geeksforgeeks.org/array-rotation/
public class ReverseKthArray {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(nums));
		rotateArray1(nums, 5);

		int[] nums1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(Arrays.toString(nums1));
		rotateArray2(nums1, 4);

		int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		rotate(nums2, 9);
		System.out.println(Arrays.toString(nums2));
	}

	public static void rotateArray1(int[] nums, int k) {
		int length = nums.length - 1;
		
		if (k < 0 || k > length)
			return;

		for (int i = 0; i < k; i++) {
			int temp = nums[0];
			for (int j = 0; j < length; j++)
				nums[j] = nums[j + 1];

			nums[length] = temp;
		}

		System.out.println(Arrays.toString(nums));
	}

	public static void rotateArray2(int[] nums, int k) {
		if (k < 0 || k > nums.length)
			return;

		int length = nums.length;
		int[] copy = new int[length];

		int count = 0;
		for (int i = k; i < length; i++)
			copy[count++] = nums[i];

		for (int j = 0; j < k; j++)
			copy[count++] = nums[j];

		System.out.println(Arrays.toString(copy));
	}

	public static void reverseArr(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			end--;
			start++;
		}
	}

	//k = 2 => 1 2 3 4 5 6 -> 6 5 4 3 2 1 -> 5 6 1 2 3 4 
	public static void rotate(int[] nums, int k) {
		int length = nums.length;
		if (k < 0 || k > length)
			return;
		
		//k = k % len;
		//len--;
		reverseArr(nums, 0, length);
		reverseArr(nums, 0, k - 1);
		reverseArr(nums, k, length);
	}

}
