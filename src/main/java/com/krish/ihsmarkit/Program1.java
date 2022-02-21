package com.krish.ihsmarkit;

import java.util.HashSet;
import java.util.Set;

public class Program1 {

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(new Long(10));
		s.add(new Integer(10));

		System.out.println(s);
	}
}
