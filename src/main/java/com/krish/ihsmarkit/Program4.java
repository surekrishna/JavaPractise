package com.krish.ihsmarkit;

import java.util.List;

public class Program4 {

	public static void main(String[] args) {
		System.out.println(removeVowel("krishna"));
	}

	private static String removeVowel(String value) {
		List<Character> values = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

		String result = "";

		for (int i = 0; i < value.length(); i++)
			if (!values.contains(value.charAt(i)))
				result += value.charAt(i);

		return result;
	}
}
