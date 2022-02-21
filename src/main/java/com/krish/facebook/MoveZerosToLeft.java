package com.krish.facebook;

public class MoveZerosToLeft {

	public static void main(String[] args) {
		
		int[] numbers1 = {0, 3, 6, 1, 9, 0, 23, 56, 0, 3};
		printNumbers(moveZerosToLeft(numbers1));

		int[] numbers2 = {0, 3, 6, 1, 9, 0, 23, 56, 0, 0};
		printNumbers(moveZerosToLeft(numbers2));
		
	}
	
	public static int[] moveZerosToLeft(int[] numbers) {
		int length = numbers.length - 1;
		int count = length;
		
		for(int i = length ; i >= 0; i--) {
			int number = numbers[i];
			if(number != 0)
				numbers[count--] = number;
			
		}

		while (count > 0)
			numbers[count--] = 0;
		
		return numbers;
	}
	
	public static void printNumbers(int[] numbers) {
		for(int n : numbers)
			System.out.print(n + " ");
		
		System.out.println();
	}

}
