package com.linus.DailyPractice.matrix;

import java.util.ArrayList;


// Given a matrix in which all the rows are sorted, 
// find the common element in all the rows
public class PrintMatrix 
{
	
	
	public static void main(String[] args) 
	{
		int mat [][]= { {1, 2, 6, 20},
					   {4, 5, 6, 9},
					   {2, 6, 9, 11},
					   {3, 6, 14, 20} };
		findCommonElement(mat);
	}
	
	private static void findCommonElement(int[][] mat)
	{
		ArrayList<Integer> commRowArr = new ArrayList<>(); // storing the row index in which there is the min element
		int min = mat[0][3];
		int count = 0; 					
		for(int i=1;i<4;i++)
		{
			if(mat[i][3] < min)
			{
				min = mat[i][3];
				commRowArr.add(i); 
			}
			else if (mat[i][3] == min)
			{
				commRowArr.add(i);   // to skip processing for row = i when we search for the common element
				count = count + 1;
			}
		}
		System.out.println("min is : "+ min);
		//System.out.println(Arrays.toString(commRowArr.toArray()));
		int i,j = 0;
		for(i=0;i<4;i++)
		{
			if(!commRowArr.contains(i))
			{
				for(j=2;j>=0;j--)
				{
					if(mat[i][j] > min)
						continue;
					else if(mat[i][j] == min)
					{
						count+=1;
						break;
					}
					else if(mat[i][j] < min)
					{
						System.out.println(mat[i][j]);
						System.out.println("No common element exists.");
						return;
					}
				}
			}
		}		
		if(count == 4)
			System.out.println("Common element is : " + min);
	}
}
