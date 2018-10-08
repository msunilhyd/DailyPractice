package com.linus.DailyPractice.stack;

import java.util.Arrays;
import java.util.Stack;

public class StackTest 
{
	public static void main(String[] args) 
	{
		Stack<Integer> testStack = new Stack<>();
		testStack.push(23);
		testStack.push(67);
		testStack.push(45);
		System.out.println(Arrays.toString(testStack.toArray()));
		
	}
}
