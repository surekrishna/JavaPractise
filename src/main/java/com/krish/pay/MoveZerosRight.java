package com.krish.pay;

import java.util.Arrays;

public class MoveZerosRight {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0, 3, 0, 0, 0, 9, 7, 0 };
		System.out.println(Arrays.toString(nums));
		moveZeros(nums);
	}
	
	public static void moveZeros(int[] nums) {
		int count = 0;
		int length = nums.length;
		
		for(int i = 0; i < length; i++) 
			if(nums[i] != 0)
				nums[count++] = nums[i];
		
		while(count < length) 
			nums[count++] = 0;
		
		System.out.println(Arrays.toString(nums));
	}

}
