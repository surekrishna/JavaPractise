package com.krish.iq;

public class DivideTwoIntegers {

	public static void main(String[] args) {

		System.out.println(divide(10, 3));
		System.out.println(divide(7, -3));
		System.out.println(divide(1, 1));
		System.out.println(divide(1, -1));
		// System.out.println(divide(-21474836482, 0));
		
		System.out.println(divide1(10, 3));
		System.out.println(divide1(7, -3));
		System.out.println(divide1(1, 1));
		System.out.println(divide1(1, -1));

	}

	public static int divide(int dividend, int divisor) {
		int count = 0;
		boolean isDividendNegative = false;
		boolean isDivisorNegative = false;

		if (dividend >= Integer.MAX_VALUE) {
			if (divisor == 1)
				return Integer.MAX_VALUE;

			if (divisor == -1)
				return Integer.MIN_VALUE;
		}

		if (dividend <= Integer.MIN_VALUE) {
			if (divisor == 1)
				return Integer.MIN_VALUE;

			if (divisor == -1)
				return Integer.MAX_VALUE;
		}

		if (dividend < 0) {
			isDividendNegative = true;
			dividend = -dividend;
		}

		if (divisor < 0) {
			isDivisorNegative = true;
			divisor = -divisor;
		}

		if (dividend == divisor) {
			count = 1;
		} else {
			while (divisor < dividend) {
				dividend -= divisor;
				count++;
			}
		}

		if ((isDividendNegative && isDivisorNegative) || (!isDividendNegative && !isDivisorNegative))
			return count;
		else
			return -count;

	}

	public static int divide1(int dividend, int divisor) {

		if (dividend >= Integer.MAX_VALUE) {
			if (divisor == 1)
				return Integer.MAX_VALUE;

			if (divisor == -1)
				return Integer.MIN_VALUE;
		}

		if (dividend <= Integer.MIN_VALUE) {
			if (divisor == 1)
				return Integer.MIN_VALUE;

			if (divisor == -1)
				return Integer.MAX_VALUE;
		}

		int sign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ? 1 : -1;

		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);

		int quotient = 0;

		while (dividend - divisor >= 0) {

			int count = 0; // counts how many doubles of 'divisor' fit in 'dividend' and in any remainders
			int prevDouble = divisor;
			int currDouble = divisor + divisor;

			while (dividend - currDouble >= 0) {
				count++;
				prevDouble += prevDouble;
				currDouble += currDouble;
			}

			//https://www.geeksforgeeks.org/left-shift-right-shift-operators-c-cpp/
			int currQuotient = (int) Math.pow(2, count); // current quotient, same as left shift: 1 << count
			quotient += currQuotient;
			dividend -= prevDouble; // 'dividend' becomes the remainder for the next iteration
		}

		return sign == 1 ? quotient : -quotient;
	}

}
