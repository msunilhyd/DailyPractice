package com.linus.DailyPractice.array;

public class GetOddOccuringElement
{
	public static void main(String[] args) 
	{
        int arr[] = new int[]{2, 3, 5, 3, 2}; 
        int n = arr.length;
        System.out.println("Odd occuring element is : " + giveOddOccuringElem(arr, n));
	}
	
	private static int giveOddOccuringElem(int[] arr, int n)
	{
		int result = 0;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i] + " XOR " + result+  " is = ");
			result = result ^ arr[i];
			 System.out.println(result);
		}
		return result;
	}
}
