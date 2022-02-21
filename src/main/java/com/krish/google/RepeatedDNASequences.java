package com.krish.google;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/repeated-dna-sequences/
public class RepeatedDNASequences {

	public static void main(String[] args) {

		System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
		System.out.println(findRepeatedDnaSequences("AAAAAAAAAAAAA"));
	}

	public static List<String> findRepeatedDnaSequences(String s) {
		Set<String> seen = new HashSet<>();
		Set<String> repeated = new HashSet<>();
		
		for(int i = 0; i + 9 < s.length(); i++) {
			String ten = s.substring(i, i + 10);
			
			if(!seen.add(ten))
				repeated.add(ten);
			
		}

		return new ArrayList<>(repeated);
	}

}
