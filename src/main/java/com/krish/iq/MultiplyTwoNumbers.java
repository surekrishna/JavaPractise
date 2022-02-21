package com.krish.iq;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		Multiply result = (a, b) -> a * b;
		
		System.out.println(result.multiply(3, 7));

	}

}

@FunctionalInterface
interface Multiply {
	Integer multiply(int a, int b);
}
