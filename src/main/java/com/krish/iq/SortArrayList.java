package com.krish.iq;

import java.util.Arrays;

public class SortArrayList {

	public static void main(String[] args) {

		char[] chars1 = {'A', 'B', 'C'};
		System.out.println(Arrays.toString(chars1));
		sort1(chars1);
		System.out.println(Arrays.toString(chars1));
		
		sortReverse1(chars1);
		System.out.println(Arrays.toString(chars1));
		
		char[] chars2 = {'A', 'B', 'C', 'D', 'E'};
		sortReverse1(chars2);
		System.out.println(Arrays.toString(chars2));
		
		int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(nums1));
		sortReverse1(nums1);
		System.out.println(Arrays.toString(nums1));
		
		//Collections.reverseOrder();
	}
	
	public static void sort1(char[] chars) {
		int length = chars.length - 1;
		
		char temp = chars[0];
		for(int i = 0; i < length; i++) {
			chars[i] = chars[i+1];
		}
		
		chars[length] = temp;
	}
	
	public static void sortReverse1(char[] chars) {
		int length = chars.length;
		int loop = length/2;
		
		for(int i = 0; i < loop; i++) {
			char temp = chars[i];
			chars[i] = chars[length - i - 1];
			chars[length - i - 1] = temp;
		}
	}
	
	public static void sortReverse1(int[] nums) {
		int length = nums.length;
		int loop = length/2;
		
		for(int i = 0; i < loop; i++) {
			int temp = nums[i];
			nums[i] = nums[length - i - 1];
			nums[length - i - 1] = temp;
		}
	}

}
