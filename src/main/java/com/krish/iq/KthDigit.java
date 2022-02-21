package com.krish.iq;

public class KthDigit {

	public static void main(String[] args) {

		int a = 5;
		int b = 2;
		int k = 2;
		
		int digit = 1;
		
		for(int i = 1; i <= b; i++)
			digit *= a;
		
		int temp = digit;
		int count = 0;
		while(temp > 0) {
			int rem = temp % 10;
			++count;
			temp /= 10;
			if(count == k) {
				System.out.println(rem);
				break;
			}
			
			
		}
	}

}
