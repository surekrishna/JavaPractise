package com.krish.iq;

public class NthEvenFibonacciNumber {

	public static void main(String[] args) {

		int count = 0;
		int number = 3;
		for(int i = 1; i <= Integer.MAX_VALUE; i++) {
			int value = fibonacci(i);
			if(value % 2 == 0) {
				count++;
				
				if(count == number) {
					System.out.println(value);
					break;
				}
			}
		}
	}
	
	public static int fibonacci(int number) {
		if(number == 0 || number == 1 || number == 2)
			return number;
		
		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
