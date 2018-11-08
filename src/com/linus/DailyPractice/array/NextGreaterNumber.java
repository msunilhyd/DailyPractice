package com.linus.DailyPractice.array;

import java.util.Collections;
import java.util.LinkedList;

public class NextGreaterNumber {

	public static void main(String[] args) {
		int x = 12543;
		
		LinkedList<Integer> digitList = new LinkedList();
		
		while(x > 0)
		{
			int mod = x % 10;
			x = x /10 ;
			digitList.add(mod);
		}
		
		for(int i=0;i<digitList.size();i++)
		{
			System.out.print(digitList.get(i) + ", ");
		}
		
		System.out.println();
		Collections.sort(digitList);
		
		for(int i=0;i<digitList.size();i++)
		{
			System.out.print(digitList.get(i) + ", ");
		}
		
	}
}
