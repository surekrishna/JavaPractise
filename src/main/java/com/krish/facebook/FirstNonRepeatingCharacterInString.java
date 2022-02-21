package com.krish.facebook;

//https://leetcode.com/problems/first-unique-character-in-a-string/submissions/
public class FirstNonRepeatingCharacterInString {

	public static void main(String[] args) {

		System.out.println(firstNonRepeatingCharacterInString("krishna"));
		System.out.println(firstNonRepeatingCharacterInString("leetcode"));
		System.out.println(firstNonRepeatingCharacterInString("loveableetcode"));
	}
	
	//A(65) - Z(90) & a(97) - z(122)
	//https://www.ssec.wisc.edu/~tomw/java/unicode.html
	public static int firstNonRepeatingCharacterInString(String value) {
		int[] frequency = new int[26];
		int length = value.length();
		
		for(int i = 0; i < length; i++)
			frequency[value.charAt(i) - 'a']++;
		
		for(int i = 0; i < length; i++)
			if(frequency[value.charAt(i) - 'a'] == 1)
				return i;
		
		return -1;
	}

}
