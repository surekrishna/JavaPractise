package com.krish.iq;

//https://www.geeksforgeeks.org/different-ways-to-print-fibonacci-series-in-java/
//https://www.java67.com/2016/05/fibonacci-series-in-java-using-recursion.html
public class FibonacciNumbers {

	public static void main(String[] args) {
		
		printFibonacciNumbers1(6);
		printFibonacciNumbers1(0);
		printFibonacciNumbers1(10);
		printFibonacciNumbers1(-32);

		System.out.println("========================");
		
		printFibonacciNumbers3(6);
		printFibonacciNumbers3(0);
		printFibonacciNumbers3(10);
		printFibonacciNumbers3(-32);

		//for (int i = 0; i <= 15; i++)
			//System.out.print(printFibonacciNumbers2(i) + " ");
		
	}

	public static void printFibonacciNumbers1(int number) {
		if (number <= 0) {
			System.out.println("Please enter valid positive number!");
			return;
		}

		int counter = 0;
		int num1 = 0;
		int num2 = 1;

		while (counter < number) {
			System.out.print(num1 + " ");

			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			counter++;
		}
		System.out.println();
	}

	public static int printFibonacciNumbers2(int number) {
		if (number == 1 || number == 2)
			return number;

		return printFibonacciNumbers2(number - 1) + printFibonacciNumbers2(number - 2);
	}
	
	//https://www.youtube.com/watch?v=WrWFfzt3ayc
	public static void printFibonacciNumbers3(int number) {
		if (number < 0) {
			System.out.println("Please enter valid number!");
			return;
		}
		
		int a = 0;
		int b = 1;
		
		while(number > 0) {
			System.out.print(a + " ");
			
			int c = a + b;
			a = b;
			b = c;
			number--;
		}
		System.out.println();
	}

}
