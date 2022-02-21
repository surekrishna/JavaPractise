package com.krish.iq;

public class MoveZeros {

	public static void main(String[] args) {

		//int[] numbers = {1, 2, 0, 0, 0, 3, 6};
		int[] numbers = {1, 2, 0, 4, 3, 0, 5, 0};
		moveZeroesToRight(numbers);
		printNumbers(numbers);
		
		int[] numbers1 = {1, 2, 0, 4, 3, 0, 5, 0};
		moveZereosToLeft(numbers1);
		printNumbers(numbers1);
		
		int[] numbers2 = {0,1,0,3,12};
		moveZeroesToRight1(numbers2);
		printNumbers(numbers2);
	}
	
	private static void printNumbers(int[] numbers) {
		for(int number : numbers)
			System.out.print(number + " ");
		
		System.out.println();
	}
	
	private static void moveZeroesToRight(int[] numbers) {
		int length = numbers.length;
		int count = 0;
		
		for(int i = 0; i < length; i++)
			if(numbers[i] != 0)
				numbers[count++] = numbers[i];
		
		while(count < length)
			numbers[count++] = 0;
	}
	
	private static void moveZeroesToRight1(int[] numbers) {
		int j = 0;
		int length = numbers.length;
		
		for(int i = 0; i < length; i++) {
			if(numbers[i] != 0) {
				int temp = numbers[j];
				numbers[j] = numbers[i];
				numbers[i] = temp;
				j++;
			}
		}
	}
	
	private static void moveZereosToLeft(int[] numbers) {
		int length = numbers.length - 1;
		int count  = length;
		
		for(int i = length; i >= 0; i--)
			if(numbers[i] != 0)
				numbers[count--] = numbers[i];
		
		while(count >= 0)
			numbers[count--] = 0;
	}

}
