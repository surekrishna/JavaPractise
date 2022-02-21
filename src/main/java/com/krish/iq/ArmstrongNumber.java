package com.krish.iq;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println(isArmstrongNumber(135) ? "ArmstrongNumber" : "Not ArmstrongNumber");
		
		System.out.println(isArmstrongNumber(153) ? "ArmstrongNumber" : "Not ArmstrongNumber");
		
	}

	private static boolean isArmstrongNumber(int number) {
		int temp = number;
		int sum = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			
			sum += rem * rem * rem;
			
			temp /= 10;
		}
		
		return number == sum;
	}
}
