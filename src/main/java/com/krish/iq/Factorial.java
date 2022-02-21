package com.krish.iq;

//https://www.geeksforgeeks.org/java-program-for-factorial-of-a-number/
public class Factorial {

	public static void main(String[] args) {

		System.out.println(getFactorial1(6));
		System.out.println(getFactorial1(5));
		System.out.println(getFactorial1(10));
		
		System.out.println("============");
		
		System.out.println(getFactorial2(6));
		System.out.println(getFactorial2(5));
		System.out.println(getFactorial2(10));
		
		System.out.println("============");
		
		System.out.println(getFactorial3(6));
		System.out.println(getFactorial3(5));
		System.out.println(getFactorial3(10));
		
	}
	
	public static int getFactorial1(int number) {
		int fact = 1;
		
		if(number == 0)
			return fact;
		
		for(int i = number; i >= 1; i--)
			fact *= i;
		
		return fact;
	}
	
	public static int getFactorial2(int number) {
		if(number == 0)
			return 1;
		
		return number * getFactorial2(number - 1);
	}
	
	public static int getFactorial3(int number) {
		return number == 0 ? 1 : number * getFactorial3(number - 1);
	}

}
