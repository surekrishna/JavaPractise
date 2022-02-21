package com.krish.iq;

public class SumOfDigitsPalindrome {

	public static void main(String[] args) {

		System.out.println(isSumOfDigitsPalindrome(112));
		
		System.out.println(isSumOfDigitsPalindrome(56));
	}
	
	private static boolean isSumOfDigitsPalindrome(int number) {
		int temp = number;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum += rem;
			
			temp /= 10;
		}
		
		int palindrome = 0;
		
		int temp1 = sum;
		
		while (temp1 > 0) {
			int rem = temp1 % 10;
			
			palindrome = (palindrome * 10) + rem;
			
			temp1 /= 10;
		}
		
		return sum == palindrome ? true : false;
	}

}
