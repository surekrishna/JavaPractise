package com.krish.iq;

//https://www.geeksforgeeks.org/find-number-closest-n-divisible-m/
public class ClosestNumber {

	public static void main(String[] args) {

		System.out.println(getClosestNumber(-15, 6));
		System.out.println(getClosestNumber(13, 4));

	}

	private static int getClosestNumber(int n, int m) {
		int result = n / m;

		int n1 = result * m;

		int n2 = (n * m) > 0 ? (m * (result + 1)) : (m * (result - 1));

		if (Math.abs(n - n1) < Math.abs(n - n2))
			return n1;

		return n2;
	}

}
