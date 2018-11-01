package com.linus.DailyPractice.array;

import java.util.HashMap;
import java.util.Map;

public class NonDuplicateElementIn2Arrays
{
	public static void main(String[] args) 
	{
		int[] arr = {2,5,6,9,0,3,8};
		int[] brr = {5,0,3,8,2,9};
		
		Map<Integer, Integer> countMap = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int n = arr[i];
			if(i>=brr.length)
				continue;
			int k = brr[i];
			
			if(countMap.containsKey(arr[i]))
			{
				countMap.put(arr[i], countMap.get(arr[i]) + 1);
			}
			else
				countMap.put(arr[i], 1);
			if(countMap.containsKey(brr[i]))
			{
				countMap.put(brr[i], countMap.get(brr[i]) + 1);
			}
			else
				countMap.put(brr[i], 1);
		}
		for(Map.Entry<Integer, Integer> e : countMap.entrySet())
		{
			if(e.getValue() == 1)
			{	
				System.out.println("Non-Duplicate value is : " + e.getKey());
				break;
			}
		}
	}
}
