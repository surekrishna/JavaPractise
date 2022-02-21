package com.krish.feb;

//https://leetcode.com/problems/longest-common-prefix/
//https://leetcode.com/problems/longest-common-prefix/discuss/1755871/Java-code-beats-100-with-Simple-explanation
public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] values = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(values));
	}

	public static String longestCommonPrefix(String[] arr) {

		/* Horizontal approach */

		// Basing condition
		if (arr == null || arr.length == 0) {
			return "";
		}

		String prefix = arr[0]; // used to compare prefix with other words in arr

		for (int i = 1; i < arr.length; i++) {
			while (arr[i].indexOf(prefix) != 0) {
				// we will reduce the prefix when it doesn't matches
				prefix = prefix.substring(0, prefix.length() - 1); // last char of prefix is removed

				// small optimisation
				if (prefix.length() == 0) {
					return "";
				}
			}
		}
		return prefix;
	}

}
