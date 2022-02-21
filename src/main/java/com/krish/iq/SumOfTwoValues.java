package com.krish.iq;

import java.util.HashSet;
import java.util.Set;

public class SumOfTwoValues {

	public static void main(String[] args) {
		int[] numbers = { 3, 5, 8, 12, 34, 9, 32 };
		int sum = 21;

		System.out.println(twoSum(numbers, sum));

	}

	public static boolean twoSum(int[] numbers, int sum) {
		Set<Integer> values = new HashSet<>();
		
		for(int n : numbers) {
			if(values.contains(sum - n)) {
				System.out.println("Two Numbers are :: " + n + ", " + (sum -n));
				return true;	
			}
				
			values.add(n);
		}
		
		return false;
	}

}
