package com.krish.google;

//https://leetcode.com/problems/sort-array-by-parity-ii/
public class SortArrayByPriority {

	public static void main(String[] args) {

		int[] numbers = { 4, 2, 5, 7 };
		printNumbers(sortArrayByPriority(numbers));
	}

	public static int[] sortArrayByPriority(int[] numbers) {
		int even = 0;
		int odd = 1;
		int length = numbers.length;

		while (even < length && odd < length) {

			if (numbers[even] % 2 != 0) {
				swap(numbers, even, odd);

				odd += 2;
			} else {
				even += 2;
			}
		}

		return numbers;
	}

	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void printNumbers(int[] numbers) {
		for (int number : numbers)
			System.out.print(number + " ");

		System.out.println();
	}

}
