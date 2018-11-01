package com.linus.DailyPractice.string;

import java.util.Arrays;

public class FirstCharNonRepeating
{
	public static void main(String[] args) 
	{
		String s = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB";
		System.out.println(findFirstNonRepeatingCharacter(s));
	}
	
	private static char findFirstNonRepeatingCharacter(String s)
	{
		int[] charIdx = new int[256];
		Arrays.fill(charIdx, -1);
		
		for(int i=0;i<s.length();i++)
		{
			if(charIdx[s.charAt(i)] == -1)
			{
				charIdx[s.charAt(i)] = i;
			}
			else
			{
				charIdx[s.charAt(i)] = -2;
			}
		}
		
		int finalIndex = charIdx.length-1;
		
		for(int i=0;i<charIdx.length;i++)
		{
			if(charIdx[i] > 0 && charIdx[i] < finalIndex)
				finalIndex = charIdx[i];
		}
		return s.charAt(finalIndex);
	}
	
}
