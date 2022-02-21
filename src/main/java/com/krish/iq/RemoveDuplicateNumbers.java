package com.krish.iq;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 2, 3, 4, 4, 5, 12, 34, 45, 45 };
		int n = numbers.length;

		n = removeduplicates(numbers, n);

		// Printing The array elements
		for (int i = 0; i < n; i++)
			System.out.print(numbers[i] + " ");

	}

	public static int removeduplicates(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		// creating another array for only storing
		// the unique elements
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j++] = a[i];
			}
		}

		temp[j++] = a[n - 1];

		// Changing the original array
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		return j;
	}

}
