package com.linus.DailyPractice.hr;

public class IfElse
{
	public static void main(String[] args) 
	{
		int n  = 3;
		System.out.println(giveWeirdness(n));
		
	}
	
	private static String giveWeirdness(int n)
	{
		if((n % 2) != 0)
		{
			return "Weird";
		}
		else if((n % 2) == 0)
		{
			if(n>=2 && n<=5)
				return "Not Weird";
			else if(n>=6 && n<=20)
				return "Weird";
			else if(n > 20)
				return "Not Weird";
		}
		return null;
	}
}
