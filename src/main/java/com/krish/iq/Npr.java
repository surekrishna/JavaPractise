package com.krish.iq;

//https://practice.geeksforgeeks.org/problems/npr4253/1
public class Npr {

	public static void main(String[] args) {
		
		System.out.println(nPr(2, 1));
		System.out.println(nPr(3, 3));
		System.out.println(nPr(5, 3));
	}
	
	public static int nPr(int n, int r) {
		return getFact(n)/getFact(n -r);
	}
	
	public static int getFact(int number) {
		return number == 0 ? 1 : number * getFact(number - 1);
	}

}
