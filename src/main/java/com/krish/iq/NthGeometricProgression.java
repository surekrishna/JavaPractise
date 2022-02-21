package com.krish.iq;

public class NthGeometricProgression {

	public static void main(String[] args) {

//		Input: A = 2, R = 2, N = 4
//		Output: 16
//		Explanation: The GP series is 
//		2, 4, 8, 16, 32,... in which 16 
//		is th 4th term.
		
		//formula a1 * r(N-1)
		
		int a = 2;
		int r = 2;
		int n = 4;
		
		int result = 1;
		
		for(int i = 1; i <= n -1; i++) {
			result *= r;
		}
		
		System.out.println(a * result);
		
		int a1 = 2;
		int r1 = 3;
		int n1 = 5;
		
		int result1 = 1;
		
		for(int i = 1; i <= n1 -1; i++) {
			result1 *= r1;
		}
		
		System.out.println(a1 * result1);
	}

}
