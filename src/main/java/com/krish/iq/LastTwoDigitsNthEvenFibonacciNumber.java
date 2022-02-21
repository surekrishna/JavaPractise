package com.krish.iq;

public class LastTwoDigitsNthEvenFibonacciNumber {

	public static void main(String[] args) {

	
		int count = 0;
		int number = 14;//377
		int temp = 0;
		int result = 0;
		
		for(int i = 0; i <= Integer.MAX_VALUE; i++) {
			int num = NthEvenFibonacciNumber.fibonacci(i);
			count++;
			
			if(count == number) {
				temp = num;
				break;
			}
		}
		
		int twoCount = 0;
		while (temp > 0) {
			int rem = temp % 10;
			result = result * 10 + rem;
			twoCount++;
			temp /= 10;
			
			if(twoCount == 2)
				break;
		}
		
		System.out.println(result);
	}

}
