package com.krish.ihsmarkit;

public class Program5 {

	public static void main(String[] args) {
		System.out.println(isArmstrongNumber(135));
		System.out.println(isArmstrongNumber(153));
	}
	
	private static boolean isArmstrongNumber(int number) {
		int temp = number;
		int sum = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			sum += rem * rem * rem;

			temp /= 10;
		}
		
		return sum == number ? true : false;
	}

}
