package com.krish.iq;

public class StarPattern {

	public static void main(String[] args) {

		int noOfRows = 15;
		
		for(int i = 1; i <= noOfRows; i++) {
			
			for(int j = i; j <= noOfRows; j++)
				System.out.print(" ");
			
			for(int k = 1; k <= i; k++)
				System.out.print("* ");
			
			System.out.println();
		}
	}

}
