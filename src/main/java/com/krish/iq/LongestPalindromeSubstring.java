package com.krish.iq;

//https://www.youtube.com/watch?v=y2BD4MJqV20
public class LongestPalindromeSubstring {

	public static void main(String[] args) {

		System.out.println(longestSubstring("racecar"));
		System.out.println(longestSubstring("aaaabbaaaa"));
		System.out.println(longestSubstring("abcdefghij"));
	}
	
	public static String longestSubstring(String val) {
		if(val == null || val.isBlank())
				return "";
		
		int start = 0;
		int end = 0;
		for(int i = 0; i < val.length(); i++) {
			int len1 = expandRange(val, i, i);
			int len2 = expandRange(val, i, i+1);
			int len = Math.max(len1, len2);
			
			if(len > end - start) {
				start = i - ((len - 1)/2);
				end = i + (len / 2);
			}
		}
		
		return val.substring(start, end + 1);
	}
	
	public static int expandRange(String val, int start, int end) {
		if(null == val || start > end) return 0;
		
		while(start >= 0 && end < val.length() && val.charAt(start) == val.charAt(end)) {
			start--;
			end++;
		}
		
		return end - start - 1;
	}

}
