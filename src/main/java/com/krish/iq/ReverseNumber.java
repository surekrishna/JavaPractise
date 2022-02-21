package com.krish.iq;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println(getReverseNumber(123));
		
		System.out.println(getReverseNumber(11));
		
		System.out.println(getReverseNumber(101));
		
		System.out.println(getReverseNumber(100));
	}
	
	private static int getReverseNumber(int number) {
		int temp = number;
		int reverse = 0;
		
		while (temp > 0) {
			int rem = temp % 10;
			
			reverse = (reverse * 10 ) + rem;
			
			temp /= 10;
		}
		
		return reverse;
	}

}
