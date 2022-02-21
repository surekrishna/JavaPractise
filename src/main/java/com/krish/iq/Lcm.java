package com.krish.iq;

public class Lcm {

	public static void main(String[] args) {

		System.out.println(getLcm(15, 25));
		System.out.println(getLcm(20, 60));
		System.out.println(getLcm(5, 7));
	}
	
	public static int getLcm(int a, int b) {
		return (a * b)/Gcd.getGcd(a, b);
	}

}
