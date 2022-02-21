package com.krish.iq;

public class PrintNumbersWithoutLoop {

	public static void main(String[] args) {
		printNumbers(100);
		System.out.println();
		printNos(1, 100);

	}

	public static void printNumbers(int maxNumber) {
		if (maxNumber > 0) {
			printNumbers(maxNumber - 1);
			System.out.print(maxNumber + " ");
		}
		return;
	}
	
	public static void printNos(int first, int last) {
		if(first <= last) {
			System.out.print(first + " ");
			printNos(first + 1, last);
		}
	}

}
