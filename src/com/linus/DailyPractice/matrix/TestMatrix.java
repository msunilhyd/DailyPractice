package com.linus.DailyPractice.matrix;

public class TestMatrix
{
	static int[] offsetArr = {-1, 0 , +1};
	
	public static void main(String[] args) 
	{
		/*
		int[][] matrix = {
							{0, 1, 0, 1},
							{1, 1, 1, 0},
							{0, 0, 0 ,1},
							{1, 1, 0, 0},
						 };
		*/
		int[][] matrix = {
                {1, 0, 1, 0, 1},
                {1, 1, 0, 0, 0},
                {0, 1, 0, 1, 1},
             };
		
		System.out.println("No of islands is : " + getNoOfIslands(matrix));
	}
	
	private static int getNoOfIslands(int[][] matrix)
	{
		int count = 0;
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		for(int i=0; i<visited.length; i++)
		{
			for(int j=0; j<visited[0].length; j++)
			{
				visited[i][j] = false;
			}
		}
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[0].length;j++)
			{
				if(matrix[i][j] == 1 && !visited[i][j])
				{
					count+=1;
					doDFS(matrix, i, j, visited);
				}
			}
		}
		return count;
	}
	
	private static void doDFS(int[][] matrix, int i, int j, boolean[][] visited)
	{		
		if(visited[i][j])
			return;
		
		visited[i][j] = true;
		int yOffset;
		int xOffset;		
		
		for(int k=0; k<offsetArr.length; k++)
		{
			xOffset = offsetArr[k];
			
			for(int l=0; l<offsetArr.length; l++)
			{
				yOffset = offsetArr[l];
			
				if(xOffset == 0 && yOffset == 0)
					continue;
				
				if(checkIfNeighBourExists(matrix, i + xOffset, j + yOffset))
				{
					doDFS(matrix, i + xOffset, j + yOffset, visited);
				}
			}
		}
	}
	
	private static boolean checkIfNeighBourExists(int[][] matrix, int i, int j)
	{
		if((i >=0 && i < matrix.length) && (j >= 0 && j<matrix[0].length))
		{
			if(matrix[i][j] == 1)
				return true;
		}
		return false;
	}
}
