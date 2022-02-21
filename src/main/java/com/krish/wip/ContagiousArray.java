package com.krish.wip;

import java.util.HashMap;
import java.util.Map;

public class ContagiousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int findMaxLength(int[] nums) {
		int longestSubArray = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < nums.length; i++) {
			
			sum += nums[i] == 0 ? -1 : 1;
			
			if(sum == 0) {
				if(longestSubArray < i + 1)
					longestSubArray = i + 1;
			} //else if (map.get)
 			
		}
		
		return longestSubArray;
	}

}
