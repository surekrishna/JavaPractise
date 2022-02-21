package com.krish.feb;

//https://leetcode.com/problems/valid-palindrome-ii/
//https://www.udemy.com/course/leetcode-questions-solutions-explained-6/learn/lecture/23621268#overview
public class ValidPalindromeII {

	public static void main(String[] args) {

		System.out.println(validPalindrome("aba"));
		System.out.println(validPalindrome("abca"));
		System.out.println(validPalindrome("abcal"));
		System.out.println(validPalindrome("moml"));
		
	}

	public static boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while(left < right) {
			
			if(s.charAt(left) != s.charAt(right)) {
				return isPalidrome(s, left + 1, right) || isPalidrome(s, left, right - 1);
			}
			
			left++;
			right--;
		}
		
		return true;
	}
	
	public static boolean isPalidrome(String s, int from, int to) {
		while(from < to) {
			if(s.charAt(from) != s.charAt(to)) {
				return false;	
			}
		
			from++;
			to--;
		}
		
		return true;
	}

}
