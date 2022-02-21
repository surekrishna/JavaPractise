package com.krish.pay;

public class FindConnectedCells {
	public static int findNumberConnected(int a, int b, int[][] z) {
		boolean canUp = (a - 1 >= 0);
		boolean canDown = (a + 1 < z.length);
		boolean canRight = (b + 1 < z[0].length);
		boolean canLeft = (b - 1 >= 0);

		int value = z[a][b];

		int up = 0;
		int down = 0;
		int right = 0;
		int left = 0;

		z[a][b] = 2;

		if (canUp && z[a - 1][b] == value) {
			up = findNumberConnected(a - 1, b, z);
		}
		if (canDown && z[a + 1][b] == value) {
			down = findNumberConnected(a + 1, b, z);
		}
		if (canLeft && z[a][b - 1] == value) {
			left = findNumberConnected(a, b - 1, z);
		}
		if (canRight && z[a][b + 1] == value) {
			right = findNumberConnected(a, b + 1, z);
		}

		return up + left + right + down + 1;
	}

	public static void main(String[] args) {
		System.out.println("Finding connections");

//		int[][] z = new int[][] {
//
//				{ 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1 }, 
//				{ 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1 },
//				{ 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1 }, 
//				{ 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1 },
//				{ 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1 }, };

		int[][] z = new int[][] { 
			{ 0, 1, 0, 0, 1, 0 }, 
			{ 0, 1, 1, 0, 0, 0 }, 
			{ 0, 0, 1, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1 }, 
			{ 0, 1, 0, 0, 0, 1 }, 
			{ 1, 1, 0, 0, 1, 1 } };
			
		int x = 1;
		int y = 1;

		System.out.println("Number of connected cells from " + x + "," + y + " is: " + findNumberConnected(x, y, z));
	}
}
