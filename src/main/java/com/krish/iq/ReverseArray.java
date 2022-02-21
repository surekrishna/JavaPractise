package com.krish.iq;

public class ReverseArray {

	public static void main(String[] args) {
		int[] numbers = {5,7,1,34,29,67,49,81,31,299};
		
		int length = numbers.length;
		int loop = length/2;
		
		for(int i = 0; i < loop; i++) {
			int temp = numbers[i];
			numbers[i] = numbers[length - i - 1];
			numbers[length - i - 1] = temp;
		}
		
		for(int n : numbers) 
			System.out.print(n + " ");

	}

}
