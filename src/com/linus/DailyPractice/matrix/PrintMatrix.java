package com.linus.DailyPractice.matrix;

import java.util.ArrayList;


// Given a matrix in which all the rows are sorted, 
// find the common element in all the rows
public class PrintMatrix 
{	
	public static void main(String[] args) 
	{
		int mat [][]= { {9, 10, 11, 12},
					   {4, 6, 9, 13},
					   {2, 6, 7, 9},
					   {3, 5, 9, 20} };
		findCommonElement(mat);
	}
	

	private static void findCommonElement(int[][] mat)
	{
		ArrayList<Integer> commRowArr = new ArrayList<>(); // storing the col index in which there is the min element

		int min = mat[0][3];
		int count = 1;
		int i, minRow = 0;
		commRowArr.add(0);
		for(i=1;i<4;i++)
		{
			if(mat[i][3] < min)
			{
				min = mat[i][3];
				commRowArr.clear();
				commRowArr.add(i);
				minRow = i;
			}
			else if (mat[i][3] == min)
			{
				commRowArr.add(i);   // to skip processing for row = i when we search for the common element
				count = count + 1;
			}
		}

		int j = 0,k = 3;
		while(count < 4 && k>=0)
		{
			min = mat[minRow][k];
			
			for(i=0;i<4;i++)
			{
				if(!commRowArr.contains(i))
				{
					for(j=2;j>=0;j--)
					{
						if(mat[i][j] > min)
						{
							continue;		
						}
						else if(mat[i][j] == min)
						{
							count+=1;
							break;
						}
					}
				}
			}
						
			if(j == 0 && i == 4 || count<4)
			{
				count = 1;
				k = k-1;
			}
		}
		if(count == 4)
			System.out.println("Common element is : " + min);
		else
		{
			System.out.println("No common element exists");
		}
	}
}
