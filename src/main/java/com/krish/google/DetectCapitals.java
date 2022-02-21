package com.krish.google;

//https://leetcode.com/problems/detect-capital/
public class DetectCapitals {

	public static void main(String[] args) {

		System.out.println(detectCapitalUse("LeetCode"));
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("krish"));
		System.out.println(detectCapitalUse("India"));
		System.out.println(detectCapitalUse("JavA"));
		
	}
	
	//A(65) - Z(90) & a(97) - z(122)
	//https://www.ssec.wisc.edu/~tomw/java/unicode.html
	//USA, krish, India = true | LeetCode, JavA = false
	public static boolean detectCapitalUse(String word) {
		int capitals = 0;
		
		for(char c : word.toCharArray())
			if('Z' - c >= 0)
				capitals++;
			
		return (capitals == 0 || capitals == word.length()) || (capitals == 1 && 'Z' - word.charAt(0) >= 0);
	}

}
