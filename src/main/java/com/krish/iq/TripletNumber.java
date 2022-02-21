package com.krish.iq;

public class TripletNumber {

	public static void main(String[] args) {

		int numbers[] = { 1, 3, 4, 4 };
		tripletIncreasingOrder(numbers);
	}

	private static void tripletIncreasingOrder(int[] numbers) {
		int length = numbers.length;
		int first = numbers[0];
		int second = Integer.MIN_VALUE;
		int sequence = 1;
		
		if(length < 3) {
			System.out.println("array size should be more than 3 numbers!");
			return;
		}
		
		for(int i = 0; i < length; i++) {
			
			if (first == numbers[i]) {
				continue;
			} else if(numbers[i] < first) {
				first = numbers[i];
				continue;
			} else if (numbers[i] > second) {
				sequence++;
				
				if(sequence == 3) {
					System.out.println("Triplet Numbers are :: " + first + " " + second + " " + numbers[i]);
					return;
				}
				
				second = numbers[i];
			}
		}
			
		System.out.print("No such triplet found");
	}

}
