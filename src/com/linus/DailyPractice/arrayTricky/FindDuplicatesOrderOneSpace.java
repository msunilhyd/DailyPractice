package com.linus.DailyPractice.arrayTricky;

import java.util.Arrays;

public class FindDuplicatesOrderOneSpace {

	public static void main(String[] args) {
		
		int[] arr = {3,3,4,4,3};
		
		int i=0;
		while(i<5)
		{
			int temp = arr[i];
			if(arr[temp] != temp)
			{
				int x = arr[temp];
				arr[temp] = arr[i];
				arr[i] = x;
			}
			else
				i++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j] != j)
				System.out.println(arr[j]);
		}
	}
}
