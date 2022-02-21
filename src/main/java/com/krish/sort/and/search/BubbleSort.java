package com.krish.sort.and.search;

public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers = {10, 3, 18, 20, 5};
		System.out.println("Before Sort");
		printNumbers(numbers);
		
		bubbleSort(numbers);
		
		System.out.println("After Sort");
		printNumbers(numbers);
	}
	
	public static void bubbleSort(int[] numbers) {
		int length = numbers.length - 1;
		
		for(int i = 0; i < length; i++) {
			
			for(int j = 0; j < length - i; j++) {
				
				if(numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
	}
	
	public static void printNumbers(int[] numbers) {
		for(int number : numbers)
			System.out.print(number + " ");
		
		System.out.println();
	}

}
