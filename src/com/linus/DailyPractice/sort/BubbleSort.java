package com.linus.DailyPractice.sort;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,7,8,4,3,5,9};
		System.out.println(Arrays.toString(arr));
		bSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<(arr.length-i);j++)
			{
				if(arr[j-1] > arr[j])
				{
					swap(arr, j-1, j);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
