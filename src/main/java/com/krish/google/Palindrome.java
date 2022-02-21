package com.krish.google;

//https://leetcode.com/problems/palindrome-number/
public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(345543));
		System.out.println(isPalindrome(3457543));
		System.out.println(isPalindrome(345743));
	}
	
	public static boolean isPalindrome(int number) {
		if(number < 0 || (number != 0 && number % 10 == 0))
			return false;
		
		int reverse = 0;
		int temp = number;
		while (temp > 0) {
			reverse = reverse * 10 + (temp % 10);
			temp /= 10;
		}
		
		return number == reverse;
	}

}
