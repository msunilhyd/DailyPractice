package com.linus.DailyPractice.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestCommonSubString {
	public static void main(String[] args) {
		
		String s1 = "ABCDEFG";
		String s2 = "BCDE";
	
		List<String> subStrList = giveListOfCommonSubstrings(s1, s2);
		System.out.println(Arrays.toString(subStrList.toArray()));
		
	}
	
	private static List<String> giveListOfCommonSubstrings(String s1, String s2)
	{
		int len1 = s1.length();
		int len2 = s2.length();
		
		int[][] mat = new int[len1][len2];
		
		ArrayList<String> strList = new ArrayList<>();
		
		int max = 0;
		
		for(int i=0;i<len1;i++)
		{
			for(int j=0;j<len2;j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					if(i == 0 || j == 0)
						mat[i][j] = 1;
					else
					{
						mat[i][j] = mat[i-1][j-1] + 1;
					}
					if(mat[i][j] > max)
					{
						max = mat[i][j];
						strList = new ArrayList<>();
						strList.add(s1.substring(i-max+1, i+1));
					}
					else if(mat[i][j] == max)
						strList.add(s1.substring(i-max+1, i+1));
						
				}
				else
					mat[i][j] = 0;
			}
		}
		return strList;
	}
	
}
