package com.krish.iq;

//https://www.geeksforgeeks.org/program-to-add-two-fractions/
public class AddTwoFractions {

	public static void main(String[] args) {

		addTwoFractions(1, 500, 2, 500);
		addTwoFractions(1, 2, 3, 2);
		addTwoFractions(1, 3, 3, 9);

	}

	public static void addTwoFractions(int n1, int d1, int n2, int d2) {
		int d3 = Gcd.getGcd(d1, d2);

		// Denominator of final fraction obtained
	    // finding LCM of den1 and den2
	    // LCM * GCD = a * b
		d3 = (d1 * d2) / d3;

		int first = n1 * (d3 / d1);
		int second = n2 * (d3 / d2);

		int n3 = first + second;

		int commonFactor = Gcd.getGcd(n3, d3);

		n3 = n3 / commonFactor;
		d3 = d3 / commonFactor;

		System.out.println(n3 + "/" + d3);
	}

}
