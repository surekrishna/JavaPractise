package com.krish.iq;

//https://javarevisited.blogspot.com/2015/03/how-to-find-largest-prime-factor-of.html#axzz7EuQUp3bZ
//https://www.c-sharpcorner.com/blogs/how-to-find-the-largest-prime-factor-from-the-given-number
public class LargestPrimeFactor {

	public static void main(String[] args) {

		System.out.println(getLargestPrimeFactor1(392832));
		System.out.println(getLargestPrimeFactor1(6));
		
		System.out.println(getLargestPrimeFactor2(392832));
		System.out.println(getLargestPrimeFactor2(6));
	}
	
	public static int getLargestPrimeFactor1(int number) {
		int i;
		int temp = number;
		
		for(i = 2; i <= temp; i++) {
			if(temp % i == 0) {
				temp /= i;
				i--;
			}
		}
		
		return i;
	}
	
	public static int getLargestPrimeFactor2(int number) {
		if(number <= 1) {
			return 0;	
		} else {
			int div = 2;
			while(div < number) {
				if(number % div != 0) {
					div++;
				}else {
					number /= div;
					div = 2;
				}
			}
		}
		
		return number;
	}

}
