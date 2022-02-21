package com.krish.iq;

public class NumberPattern {

	public static void main(String[] args) {
		
		int noOfRows = 5;
		int temp = 1;
		
		for(int i = 1; i <= noOfRows; i++) {
		
			for(int j = i; j <= noOfRows; j++) 
				System.out.print(" ");
			
			for(int k = 1; k <= i; k++) {
				System.out.print(temp + " ");
				++temp;
			}
			
			System.out.println();
		}

	}

}
