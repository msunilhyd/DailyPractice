package com.linus.DailyPractice.matrix;

public class SpiralTraversal 
{
	static void spiralPrint(int m, int n, int[][] arr)
	{
		int i, k=0, l=0;
		// k = starting row index
		// m = ending row index
		// l = starting col index
		// n = ending col index
		// i = iterator
		
		while(k<m && l <n)
		{
			// Print the first row from the remaining rows
			for(i=l;i<n;i++)
			{
				System.out.print(arr[k][i] + ", ");
			}
			k++;
			// Print the last column from the remaining columns
			for(i=k;i<m;i++)
			{
				System.out.print(arr[i][n-1] + ", ");
			}
			n--;
			// Print the last row from the remaining rows
			if(k < m)
			{
				for(i=n-1; i>=l;i--)
				{
					System.out.print(arr[m-1][i] + ", ");
				}
				m--;
			}
			// Print the first col from the remaining cols
			if(l < n)
			{
				for(i=m-1;i>=k;i--)
				{
					System.out.print(arr[i][l] + ", ");
				}
				l++;
			}
		}
	}
	
public static void main(String[] args) 
{
	int R = 3;
    int C = 6;
    int a[][] = { {1,  2,  3,  4,  5,  6},
                  {7,  8,  9,  10, 11, 12},
                  {13, 14, 15, 16, 17, 18}
                };
    spiralPrint(R,C,a);
}
}
