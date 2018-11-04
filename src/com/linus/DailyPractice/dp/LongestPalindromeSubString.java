package com.linus.DailyPractice.dp;

public class LongestPalindromeSubString {
	
	public static void main(String[] args) {
		
		String str = "baab";
		findLonestPalindromeSubString(str);
	}
	
	private static String findLonestPalindromeSubString(String str)
	{
		boolean[][] maxArr = new boolean[str.length()][str.length()];
		
		int lengthOfString = str.length();
		
		for(int i=0;i<lengthOfString;i++)
		{
			for(int j=0;j<lengthOfString;j++)
			{
				if(i>j) {
					maxArr[i][j] = false;
					continue;
				}else if(i == j)
					maxArr[i][j] = true;
				
				if((j-i) == 1)
				{					
					if(str.charAt(i) == str.charAt(j))
					{
						maxArr[i][j] = true;
					}
					else
					{
						maxArr[i][j] = false;
					}
				}
				
				for(int i1=0;i1<lengthOfString;i1++)
				{
					int j1;
					for(j1=0;j1<lengthOfString;j1++)
					{
						if(maxArr[i1][j1])
						{
							System.out.print("T + ");		
						}
						else
							System.out.print("F + ");
					}
					System.out.println();
					System.out.print("i = " + i1);
					System.out.print(" j = " + j1);
					
				}
				
				if((j-i) >= 2)
				{
					if(str.charAt(i) == str.charAt(j))
					{	
						if(maxArr[i+1][j-1] == true )
						{
							maxArr[i][j] = true;
							System.out.println("Hi");
						}else
							maxArr[i][j] = false;
					}
				}
			}
		}
		
		
		return "";
	}
}
