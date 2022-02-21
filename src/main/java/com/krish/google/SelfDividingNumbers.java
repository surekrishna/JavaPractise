package com.krish.google;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

	public static void main(String[] args) {

		System.out.println(selfDividingNumbers(1, 22));
		System.out.println(selfDividingNumbers(47, 85));
	}

	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
		
		for(int i = left; i <= right; i++) {
			if(isSelfDividingNumber(i))
				result.add(i);
		}
		
		return result;
	}

	public static boolean isSelfDividingNumber(int number) {
		int temp = number;
		
		while (temp > 0) {
			int rem = temp % 10;
			
			if(rem == 0 || number % rem != 0)
				return false;
			
			temp /= 10;
		}
		
		return true;
	}
}
