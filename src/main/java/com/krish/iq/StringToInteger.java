package com.krish.iq;

public class StringToInteger {

	public static void main(String[] args) {

		System.out.println(myAtoi("42"));
		System.out.println(myAtoi("   -42"));
		System.out.println(myAtoi("4193 with words"));

		System.out.println(myAtoi1("42"));
		System.out.println(myAtoi1("   -42"));
		System.out.println(myAtoi1("4193 with words"));

		System.out.println(myAtoi2("42"));
		System.out.println(myAtoi2("   -42"));
		System.out.println(myAtoi2("4193 with words"));
	}

	public static int myAtoi(String s) {
		long num = 0;
		int length = s.length();
		boolean isNegative = false;
		int i = 0;

		while (i < length && (s.charAt(i) == ' ' || s.charAt(i) == '0'))
			i++;

		if (s.charAt(i) == '-') {
			isNegative = true;
			i++;
		}

		for (; i < length; i++) {
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9')
				num = (num * 10) + ch - '0';
		}

		if (isNegative)
			num = -num;

		if (num < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		if (num > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		return (int) num;
	}

	public static int myAtoi1(String s) {
		long result = 0;
		boolean isNegative = false;

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9')
				result = (result * 10) + ch - '0';

			if (ch == '-')
				isNegative = true;
		}

		if (isNegative)
			result = -result;

		if (result < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		if (result > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		return (int) result;
	}

	//Works for all most of the inputs
	public static int myAtoi2(String s) {
		long num = 0;
		boolean negative = false;
		char ch;
		int i = 0;
		int length = s.length();

		// skip leading whitespace
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}

		if (i == length) {
			return 0;
		}
		// handle sign +-
		ch = s.charAt(i);
		if (ch == '-') {
			negative = true;
			i++;
		} else if (ch == '+') {
			i++;
		}
		// skip leading zero
		while (i < s.length() && s.charAt(i) == '0') {
			i++;
		}
		// -2^31=-2147483648
		// 2^31-1=2147483647
		// only 10 chars, so we calculate 11 chars. To avoid num (long type) overflow
		if (length > i + 11)
			length = i + 11;
		
		for (; i < length; i++) {
			ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				num = num * 10 + ch - '0';
			} else {
				break;
			}
		}
		
		if (negative)
			num = -num;
		
		if (num > Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		
		if (num < Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		return (int) num;
	}
}
