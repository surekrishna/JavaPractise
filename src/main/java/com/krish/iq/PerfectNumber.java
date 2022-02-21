package com.krish.iq;

//https://www.geeksforgeeks.org/java-program-to-check-if-a-given-number-is-perfect-number/
public class PerfectNumber {

	public static void main(String[] args) {

		System.out.println(isPerfectNumber1(6));
		System.out.println(isPerfectNumber1(10));
		
		System.out.println(isPerfectNumber2(6));
		System.out.println(isPerfectNumber2(10));
		System.out.println(isPerfectNumber2(28));

	}
	
	public static boolean isPerfectNumber1(int number) {
		int sum = 0;
		
		for(int i = 1; i < number; i++)
			if(number % i == 0)
				sum += i;
		
		return sum == number ? true : false;
	}
	
	public static boolean isPerfectNumber2(int number) {
		int sum = 1;
		
		for(int i = 2; i * i < number; i++)
			if(number % i == 0)
					sum += i + (number/i);
		
		return sum == number ? true : false;
	}

}
