package com.krish.iq;

public class PrintPattern1 {

	public static void main(String[] args) {
		int number = 3;
		
		for(int i = number; i >= 1; i--) {
			int temp = number;
			for(int j = number; j >= 1; j--) {
				for(int k = i; k >= 1; k--)
					System.out.print(temp + " ");
				
				temp--;
			}
			
			System.out.println();
		}
 	}

}
