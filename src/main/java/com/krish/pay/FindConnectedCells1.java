package com.krish.pay;

//https://www.youtube.com/watch?v=e_PSynVUoFE
//https://www.hackerrank.com/challenges/connected-cell-in-a-grid/problem
public class FindConnectedCells1 {

	public static void main(String[] args) {
		int[][] z = new int[][] { 
			{ 0, 1, 0, 0, 1, 0 }, 
			{ 0, 1, 1, 0, 0, 0 }, 
			{ 0, 0, 1, 0, 0, 1 },
			{ 0, 0, 0, 0, 0, 1 }, 
			{ 0, 1, 0, 0, 0, 1 }, 
			{ 1, 1, 0, 0, 1, 1 } };
			
			System.out.println(maxRegion(z));
	}
	
	static int maxConnectedCells = 0;
	
	public static int maxRegion(int[][] matrix) {
		
		for(int row = 0; row < matrix.length; row++)
			for(int col = 0; col < matrix[row].length; col++)
				if(matrix[row][col] == 1)
					dfs(matrix, row, col, 0);
		
		return maxConnectedCells;
	}
	
	public static void dfs(int[][] matrix, int i, int j, int currentCells) {
		if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[i].length || matrix[i][j] == 0)
			return;
		
		currentCells++;
		maxConnectedCells = Math.max(maxConnectedCells, currentCells);
		matrix[i][j] = 0;
		
		dfs(matrix, i-1, j, currentCells);//upper row
		dfs(matrix, i+1, j, currentCells);//below row
		dfs(matrix, i, j-1, currentCells);//left column
		dfs(matrix, i, j+1, currentCells);//right column
		
		//dfs(matrix, i-1, j-1, currentCells);//top left
		//dfs(matrix, i-1, j+1, currentCells);//top right
		//dfs(matrix, i+1, j-1, currentCells);//bottom left
		//dfs(matrix, i+1, j+1, currentCells);//bottom right
		
		matrix[i][j] = 1;
	}
}
