package com.krish.pay;

//https://www.geeksforgeeks.org/find-number-of-islands/
public class FindConnectedCells2 {

	static void dfs(int[][] matrix, int i, int j, int row, int col) {
		if (i < 0 || j < 0 || i > (row - 1) || j > (col - 1) || matrix[i][j] != 1)
			return;

		if (matrix[i][j] == 1) {
			matrix[i][j] = 0;
			dfs(matrix, i + 1, j, row, col); // right side traversal
			dfs(matrix, i - 1, j, row, col); // left side traversal
			dfs(matrix, i, j + 1, row, col); // upward side traversal
			dfs(matrix, i, j - 1, row, col); // downward side traversal
		}
		
	}

	public static int countIslands(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int count = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 1) {
					matrix[i][j] = 0;
					count++;
					dfs(matrix, i + 1, j, row, col); // right side traversal
					dfs(matrix, i - 1, j, row, col); // left side traversal
					dfs(matrix, i, j + 1, row, col); // upward side traversal
					dfs(matrix, i, j - 1, row, col); // downward side traversal
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[][] z = new int[][] { { 0, 1, 0, 0, 1, 0 }, { 0, 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 1 },
				{ 0, 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0, 1 }, { 1, 1, 0, 0, 1, 1 } };

		System.out.print("Number of islands is: " + countIslands(z));

	}

}
