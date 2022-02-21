package com.krish.pay;

import java.util.ArrayList;
import java.util.List;

//https://programs.programmingoneonone.com/2021/07/hackerrank-connected-cells-in-grid-problem-solution.html
public class Solution {

	private static int countCells(int[][] matrix, int i, int j) {
		if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == 0)
			return 0;

		int count = matrix[i][j]--;
		count += countCells(matrix, i, j + 1);//right
		count += countCells(matrix, i, j - 1);//left
		count += countCells(matrix, i - 1, j);//up
		count += countCells(matrix, i + 1, j);//down
		
		return count;
	}


	public static void main(String[] args) {
		int[][] grid = new int[][] { { 0, 1, 0, 0, 1, 0 }, { 0, 1, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0, 1 },
				{ 0, 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0, 1 }, { 1, 1, 0, 0, 1, 1 } };

				List<Integer> list = new ArrayList<>();
				for (int i = 0; i < grid.length; i++) {
					for (int j = 0; j < grid[0].length; j++) {
						int count = countCells(grid, i, j);
						if (count > 1)
							list.add(count);
					}
				}

				System.out.println(list);
	}
}
