package com.krish.google;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {

		longestSubstringWithoutRepeating("abcabcbb");
		longestSubstringWithoutRepeating("abcabc");
		longestSubstringWithoutRepeating("abcdabc");
		longestSubstringWithoutRepeating("pwwkew");

	}

	public static void longestSubstringWithoutRepeating(String value) {
		Set<Character> set = new HashSet<>();

		int i = 0;
		int j = 0;
		int max = 0;

		while (j < value.length()) {
			if (!set.contains(value.charAt(j))) {
				set.add(value.charAt(j));
				j++;

				max = Math.max(max, set.size());
			} else {
				set.remove(value.charAt(i));
				i++;
			}

		}

		// System.out.println("Longest String is = " + set);
		System.out.println("Size is = " + max);
		System.out.println();
	}

}
