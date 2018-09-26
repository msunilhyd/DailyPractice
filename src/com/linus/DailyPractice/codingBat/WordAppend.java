package com.linus.DailyPractice.codingBat;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 
Loop over the given array of strings to build a result string like this: 
when a string appears the 2nd, 4th, 6th, etc. time in the array, 
append the string to the result. Return the empty string if no string appears a 2nd time.


wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
 */

public class WordAppend 
{
	public static void main(String[] args) 
	{
		WordAppend wordAppend = new WordAppend();
		String[] str = {"a", "b", "a", "c", "a", "d", "a"};
		System.out.println(wordAppend.wordAppend(str));
	}
	public String wordAppend(String[] strings)
	{
		String str="";

		Map<String, Integer> countMap = new HashMap<>();
		for(int i=0;i<strings.length;i++)
		{
			if(countMap.containsKey(strings[i]))
			{
				int value = countMap.get(strings[i]);
				value += 1;
				countMap.put(strings[i], value);
			}
			else
			{
				countMap.put(strings[i], 1);
			}
		}

		for(Map.Entry<String, Integer> e : countMap.entrySet())
		{
			System.out.println("key is : " + e.getKey() + " , " + "value is : " + e.getValue());
	
			int count = 0;
			int value = e.getValue();
			if(value > 2)
			{
				count = value/2;
			}
			System.out.println("count is  : " + count);
			
			for(int j=0;j<count;j++)
			{
				str = str + e.getKey();
			}
		}
		
		return str;
	}

}
 