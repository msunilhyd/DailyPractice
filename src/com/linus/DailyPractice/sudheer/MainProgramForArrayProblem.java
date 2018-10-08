package com.linus.DailyPractice.sudheer;

public class MainProgramForArrayProblem
{
	public static void main(String[] args) 
	{
		ArrayProgram arrayProgram = new ArrayProgram();
		char[] testArr = {'a', 'e', 'r', 'i', 'w', 'y', 'o', 'p', 'l', 'm', 'n'};
							
		arrayProgram.setDataArray(testArr);
		arrayProgram.printArray();
		System.out.println();
		arrayProgram.reverseArray();
		arrayProgram.printArray();
		System.out.println();
		System.out.println(arrayProgram.getCountOfVowels());
	}
}
