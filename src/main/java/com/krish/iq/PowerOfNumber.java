package com.krish.iq;

//https://www.geeksforgeeks.org/check-if-a-number-is-power-of-another-number/
public class PowerOfNumber {

	public static void main(String[] args) {
		
		System.out.println(isPower(2, 8));
		System.out.println(isPower(10, 1));
		System.out.println(isPower(10, 1000));
		System.out.println(isPower(10, 1001));
		
	}
	
	public static boolean isPower(int x, int y) {
		if(x == 1)
			return y == 1;
		
		int pow = 1;
		while (pow < y)
			pow *= x;
		
		return pow == y;
	}
}
