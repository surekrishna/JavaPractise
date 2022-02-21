package com.krish.iq;

//https://practice.geeksforgeeks.org/problems/ncr1019/1
public class Ncr {

	public static void main(String[] args) {

		System.out.println(nCr(3, 2));
		System.out.println(nCr(2, 4));
	}
	
	public static int nCr(int n, int r) {
		if(n == r)
			return n;
		
		if(n < r)
			return 0;
		
		return Npr.getFact(n) / (Npr.getFact(r) * Npr.getFact(n - r));
	}

}
