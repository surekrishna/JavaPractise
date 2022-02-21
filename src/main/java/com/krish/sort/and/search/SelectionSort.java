package com.krish.sort.and.search;

public class SelectionSort {

	public static void main(String[] args) {

		int[] numbers = {9, 1, 23, 18, 45, 31, 6, 41, 17};
		System.out.println("Before Sort");
		BubbleSort.printNumbers(numbers);
		
		selectionSort(numbers);
		
		
		System.out.println("After Sort");
		BubbleSort.printNumbers(numbers);
	}
	
	public static void selectionSort(int[] numbers) {
		int length = numbers.length;
		
		for(int i = 0 ; i < length; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < length; j++)
				if(numbers[minIndex] > numbers[j])
					minIndex = j;
			
			int temp = numbers[minIndex];
			numbers[minIndex] = numbers[i];
			numbers[i] = temp;
		}
	}

}
