package com.krish.feb;

//https://leetcode.com/problems/valid-palindrome/
//https://www.udemy.com/course/leetcode-questions-solutions-explained-6/learn/lecture/23621254#overview
public class ValidPalindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
		System.out.println(isPalindrome("r2a&ce  c#a2r"));
		
		System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome1("race a car"));
		System.out.println(isPalindrome1("r2a&ce  c#a2r"));
	}

	public static boolean isPalindrome(String s) {
		boolean isPalindrome = true;
		String replaceNonAlphaNumeric = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int length = replaceNonAlphaNumeric.length();
		int loop = length/2;
		
		for(int i = 0; i < loop; i++) {
			if(replaceNonAlphaNumeric.charAt(i) != replaceNonAlphaNumeric.charAt(length - i - 1)) {
				return !isPalindrome;
			}
		}
		
		return isPalindrome;
	}
	
	public static boolean isPalindrome1(String s) {
		boolean isPalindrome = true;
		String replaceNonAlphaNumeric = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int left = 0;
		int right = replaceNonAlphaNumeric.length() - 1;
		
		while (left < right) {
			if(replaceNonAlphaNumeric.charAt(left) != replaceNonAlphaNumeric.charAt(right)) {
				return !isPalindrome;
			}
			
			left++;
			right--;
		}
		
		return isPalindrome;
	}

}
