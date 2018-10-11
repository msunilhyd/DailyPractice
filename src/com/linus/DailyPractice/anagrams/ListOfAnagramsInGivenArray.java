package com.linus.DailyPractice.anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListOfAnagramsInGivenArray
{
	public static void main(String[] args) 
	{
        String arr[] = { "cat", "dog", "tac", "god", "act" }; 
        printAnagrams(arr);
        
	}
	
	public static void printAnagrams(String[] dataArr)
	{
		HashMap<Integer, List<String>> utilMap = new HashMap<>();
		for(String s : dataArr)
		{
			char[] charArr = s.toCharArray();
			Arrays.sort(charArr);
			String word = new String(charArr);
			
			int n = word.hashCode();
			if(!utilMap.containsKey(n))
			{
				List<String> wordList = new ArrayList<>();
				wordList.add(s);
				utilMap.put(n, wordList);
			}
			else
			{
				List<String> wordList = utilMap.get(n);
				wordList.add(s);
				utilMap.put(n, wordList);
			}
		}
		
		for(List<String> sList : utilMap.values())
		{
			if(sList.size() > 1)
			{
				System.out.print(Arrays.toString(sList.toArray()));
			}
		}
	}
}
