package com.krish.iq;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {

		List<Integer> primes = new ArrayList<>();
		
		for(int i = 1; i <= 100; i++)
			if(isPrime(i))
			primes.add(i);
		
		System.out.println(primes);
		
	}
	
	private static boolean isPrime(int number) {
		boolean isPrime = true;
		
		if(number <= 1)
			isPrime = false;
		
		for(int i = 2; i * i <= number; i++) {
			if(number % i == 0)
				isPrime = false;
		}
		
		return isPrime;
	}

}
