package com.krish.iq;

public class NearestTen {

	public static void main(String[] args) {

		System.out.println("Nearest Ten for 99 :: " + getNearestTen(99));
		System.out.println("Nearest Ten for 10 :: " + getNearestTen(10));
		System.out.println("Nearest Ten for 45 :: " + getNearestTen(45));
		System.out.println("Nearest Ten for 33 :: " + getNearestTen(33));
		System.out.println("Nearest Ten for 8 :: " + getNearestTen(8));

		System.out.println("Nearest Ten up 48 :: " + getRoundUp(48));
		System.out.println("Nearest Ten down 48 :: " + getRoundDown(48));
	}

	private static int getNearestTen(int number) {
		int a = (number / 10) * 10;
		int b = a + 10;

		return number - a > b - number ? b : a;
	}
	
	private static int getRoundUp(int number) {
		return 10 * ((number + 9)/10);
	}
	
	private static int getRoundDown(int number) {
		return 10 * (number / 10);
	}

}
