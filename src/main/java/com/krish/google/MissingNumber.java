package com.krish.google;

//https://leetcode.com/problems/missing-number/
public class MissingNumber {

	public static void main(String[] args) {

		int[] numbers1 = {3, 0, 1};
		System.out.println(missingNumber(numbers1));
		
		int[] numbers2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
		System.out.println(missingNumber(numbers2));
		
		int[] numbers3 = {0, 1};
		System.out.println(missingNumber(numbers3));
	}
	
	
	public static int missingNumber(int[] numbers) {
		int length = numbers.length;
		
		//Gauss Formula (n * (n + 1))/2
		int expected = (length * (length + 1)) / 2;
		int actual = 0;
		
		for(int number : numbers)
			actual += number;
		
		return expected - actual;
	}

}
