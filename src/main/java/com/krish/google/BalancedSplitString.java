package com.krish.google;

public class BalancedSplitString {

	public static void main(String[] args) {

		System.out.println(balancedStringSplit("RLRRLLRLRL"));
	}

	public static int balancedStringSplit(String s) {
		int count = 0;
		int r = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'R')
				r++;
			else
				r--;
			
			if(r == 0)
				count++;
		}
		
		return count;
	}

}
