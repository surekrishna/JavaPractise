package com.krish.sort.and.search;

public class BinarySearch {

	public static void main(String[] args) {

		int[] numbers = {10, 23, 1, 42, 19, 61, 12, 41, 36};
		BubbleSort.bubbleSort(numbers);
		System.out.println("Numbers are :: ");
		BubbleSort.printNumbers(numbers);
		
		int search = binarySearch(numbers, 42);
		
		if(search != -1)
			System.out.println("Elememnt found at index = " + search);
		else 
			System.out.println("Element not found!");
	}
	
	public static int binarySearch(int[] numbers, int search) {
		int first = 0;
		int last = numbers.length - 1;
		
		while (first <= last) {
		
			int mid = (first + last)/2;
			
			if(numbers[mid] == search)
				return mid;
			
			if(numbers[mid] < search)
				first = mid + 1;
			else if (numbers[mid] > search)
				last = mid - 1;
			
		}
		
		return -1;
	}

}
