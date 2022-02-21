package com.krish.iq;

//https://practice.geeksforgeeks.org/problems/good-or-bad-string1417/1
public class GoodBadString {

	public static void main(String[] args) {

		//String value = "aeioup??";
		String value = "bcdaeiou??";
		
		int consonantCount = 0;
		int vowelCount = 0;
		for(int i = 0; i < value.length(); i++) {
			if(isVowel(value.charAt(i))) {
				vowelCount++;	
				consonantCount = 0;
			} else if (value.charAt(i) == '?') {
				consonantCount++;
				vowelCount++;
			} else {
				consonantCount++;
				vowelCount = 0;
			}
		}
		
		if(consonantCount > 3 || vowelCount > 5)
			System.out.println("Bad String");
		else
			System.out.println("Good String");
		
	}
	
	private static boolean isVowel(char val) {
		boolean isVowel = false;
		if('a' == val || 'e' == val || 'i' == val || 'o' == val || 'u' == val)
			isVowel = true;
		
		return isVowel;
	}

}
