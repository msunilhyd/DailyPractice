package com.linus.DailyPractice.array;

import java.util.HashMap;
import java.util.Map;

public class SubArrSumK
{
	public static void main(String[] args) 
	{
		int[] arr = {1,1,1,1,1};
		Map<Integer, Integer> preSumMap = new HashMap<>();
		int sum = 0;
		int result = 0;
		preSumMap.put(0, 1);
		int k = 3;
		
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			if(preSumMap.containsKey(sum-k))
			{
				result = result + preSumMap.get(sum-k);
			}
			if(preSumMap.containsKey(sum))
			{
				preSumMap.put(sum, preSumMap.get(sum) + 1);
			}
			else
			{
				preSumMap.put(sum, 1);
			}
		}
		System.out.println("No:of SubArrays is : " + result);
	}
}
