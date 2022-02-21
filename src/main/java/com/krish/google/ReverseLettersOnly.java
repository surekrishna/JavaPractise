package com.krish.google;

import java.util.Stack;

public class ReverseLettersOnly {

	public static void main(String[] args) {

		System.out.println(reverseOnlyLetters("ab-cd"));
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
		System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}

	public static String reverseOnlyLetters(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
	
		for(char c : s.toCharArray())
			if(Character.isLetter(c))
				stack.push(c);
		
		for(char c : s.toCharArray()) {
			if(Character.isLetter(c))
				sb.append(stack.pop());
			else
				sb.append(c);
		}
		
		return sb.toString();
	}

}
