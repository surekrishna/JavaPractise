package com.krish.sort.and.search;

public class LinearSerach {

	public static void main(String[] args) {

		int[] numbers = {2, 46, 20, 16, 18, 32, 19};
		int search = linearSearch(numbers, 32);
		if(search != -1)
			System.out.println("Element found at index = " + search);
		else
			System.out.println("Element Not found!");
	}
	
	public static int linearSearch(int[] numbers, int search) {
		int length = numbers.length;
		
		for(int i = 0; i < length; i++)
			if(search == numbers[i])
				return i;
		
		return -1;
	}

}
