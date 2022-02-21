package com.krish.iq;

//https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/
public class Gcd {

	public static void main(String[] args) {
		System.out.println(getGcd(98, 56));
		System.out.println(getGcd(36, 60));
		System.out.println(getGcd(20, 28));
	}
	
	public static int getGcd(int a, int b) {
		if (a == 0)
			return b;
		else if (b == 0 || a == b)
			return a;
		else if (a > b)
			return getGcd(a - b, b);
		
		return getGcd(a, b - a);
	}
}
