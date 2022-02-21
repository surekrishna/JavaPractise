package com.krish.iq;

import java.util.HashSet;
import java.util.Set;

//https://www.techiedelight.com/find-possible-palindromic-substrings-string/
//https://www.youtube.com/watch?v=DK5OKKbF6GI
public class PalindromeSubStrings {

	public static void main(String[] args) {

		System.out.println(findPadlindromes("google"));
		System.out.println(findPadlindromes("abbaalla"));
		System.out.println(findPadlindromes("aabbbaa"));
	}
	
	public static Set<String> findPadlindromes(String val) {
		int length = val.length();
		Set<String> set = new HashSet<>();
		
		if(length == 0 || length < 2)
			return set;
		
		
		for(int i = 0; i < length; i++) {
			findPalindrome(val, i, i, set);//odd -> midpoint -> val[i]
			findPalindrome(val, i, i+1, set);//even -> midpoint -> val[i] and val[i+1]
		}
		
		return set;
	}
	
	public static void findPalindrome(String s, int start, int end, Set<String> set) {
		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			String pal = s.substring(start, end + 1);
			
			//set.add(pal);//which includes 1 char also
			
			if(pal.length() >= 2)
				set.add(pal);
			
			start--;
			end++;
		}
	}

}
