package com.krish.google;

//https://www.youtube.com/watch?v=snOaKR2xgZg
//https://leetcode.com/problems/powx-n/submissions/
public class Power {

	public static void main(String[] args) {

		System.out.println(myPow(2.00000, 10));
		System.out.println(myPow(2.0000, -2));
	}

	public static double myPow(double x, int n) {
		return power(x, n);
	}

	private static double power(double x, long n) {
		if (n == 0)
			return 1.0;

		if (x == 1 || x == 0)
			return x;

		if (n < 0)
			return power(1/x, -n);

		double result = power(x*x, n/2);

		if (n % 2 == 1)
			result *= x;

		return result;
	}

}
