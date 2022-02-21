package com.krish.iq;

//https://www.javatpoint.com/java-binary-to-decimal
public class BinaryToDecimal {

	public static void main(String[] args) {

		int binary = 100001;
		
		int temp = binary;
		
		int count = 0;
		int decimal = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			
			int value = getNumber(2, count);
			//OR
			//int value = (int) Math.pow(2, count);
			count++;
			
			decimal += rem * value;
			
			temp /= 10;
		}
		
		System.out.println(decimal);
	}
	
	private static int getNumber(int base, int power) {
		if(base == 0)
			return 0;
		
		if (power == 0)
			return 1;
		
		int result = 1;
		for(int i = 0; i < power; i++)
			result *= base;
		
		return result;
	}

}
