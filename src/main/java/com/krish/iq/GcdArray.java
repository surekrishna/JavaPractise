package com.krish.iq;

//https://www.geeksforgeeks.org/gcd-two-array-numbers/
public class GcdArray {

	public static void main(String[] args) {

		int[] numbers1 = {2, 4, 6};
		System.out.println(getGcdOfArray(numbers1));
		
		int[] numbers2 = {1, 2, 3};
		System.out.println(getGcdOfArray(numbers2));
	
		int[] numbers3 = { 4, 8, 16 };
		System.out.println(getGcdOfArray(numbers3));	
	}
	
	public static int getGcd(int a, int b) {
		if(a == 0)
			return b;
		
		return getGcd(b % a, a);
	}
	
	public static int getGcdOfArray(int[] numbers) {
		int result = 0;
		
		for(int num : numbers) {
			result = getGcd(result, num);
			
			if(result == 1)
				return result;
		}
		
		return result;
	}

}
