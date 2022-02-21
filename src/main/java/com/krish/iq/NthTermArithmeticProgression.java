package com.krish.iq;

//https://www.geeksforgeeks.org/program-n-th-term-arithmetic-progression-series/
public class NthTermArithmeticProgression {

	public static void main(String[] args) {

		//Input : a = 2 d = 1 N = 5
		//Output :
		//The 5th term of the series is : 6
		
		//fromula -> a + (n -1) * d
		int a = 2;
		int d = 1;
		int n = 5;
		
		System.out.println(a + (n - 1) * d);
		
		//Input : a = 5 d = 2 N = 10
		//Output :
		//The 10th term of the series is : 23
		
		int a1 = 5;
		int d1 = 2;
		int n1 = 10;
		
		System.out.println(a1 + (n1 - 1) * d1);
	}

}
