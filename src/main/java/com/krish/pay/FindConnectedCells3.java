package com.krish.pay;

//https://www.geeksforgeeks.org/find-number-of-islands/
public class FindConnectedCells3 {

	static void dfs(int[][] matrix, int i, int j, int row, int col, int count) {
		if (i < 0 || j < 0 || i > (row - 1) || j > (col - 1) || matrix[i][j] != 1)
			return;

		if (matrix[i][j] == 1) {
			count++;
			matrix[i][j] = 0;
			dfs(matrix, i + 1, j, row, col, count); // right side traversal
			dfs(matrix, i - 1, j, row, col, count); // left side traversal
			dfs(matrix, i, j + 1, row, col, count); // upward side traversal
			dfs(matrix, i, j - 1, row, col, count); // downward side traversal
		}
		
		System.out.println(count);
	}

	public static int countIslands(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int count = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 1) {
					matrix[i][j] = 0;
					//count++;
					dfs(matrix, i + 1, j, row, col, count); // right side traversal
					dfs(matrix, i - 1, j, row, col, count); // left side traversal
					dfs(matrix, i, j + 1, row, col, count); // upward side traversal
					dfs(matrix, i, j - 1, row, col, count); // downward side traversal
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
