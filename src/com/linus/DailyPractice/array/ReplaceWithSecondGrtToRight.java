//Program Stmt = Given an Array, replace the element at index i with the 2nd greatest element towards its right hand side.


package com.linus.DailyPractice.array;

import java.util.Arrays;

public class ReplaceWithSecondGrtToRight 
{
	private int[] dataArr;

	public int[] getDataArr() {
		return dataArr;
	}

	public void setDataArr(int[] dataArr) {
		this.dataArr = dataArr;
	}
	
	
	public void printArr()
	{
		System.out.println(Arrays.toString(dataArr));
	}
	
	public void replaceWithSecGrtToRight()
	{
		
		int lastEl = dataArr[dataArr.length-1];
		int secLastEl = dataArr[dataArr.length-2];
		
		int max, secMax = 0;
		
		if(lastEl > secLastEl)
		{
			max = lastEl;
			secMax = secLastEl;
		}
		else
		{
			max = secLastEl;
			secMax = lastEl;
		}
		
		for(int i=dataArr.length-3; i>=0; i--)
		{
			int temp = dataArr[i];
			dataArr[i] = secMax;
			if(temp < max && temp > secMax)
			{
				secMax = temp;
			}
			if(temp > max)
			{
				secMax = max;
				max = temp;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		ReplaceWithSecondGrtToRight replaceWithSecondGrtToRight = new ReplaceWithSecondGrtToRight();
		int[] dataArr = {8,30,11,5,71,1,68,2,17,9};
		replaceWithSecondGrtToRight.setDataArr(dataArr);
		replaceWithSecondGrtToRight.printArr();
		replaceWithSecondGrtToRight.replaceWithSecGrtToRight();
		replaceWithSecondGrtToRight.printArr();
	}
	
}
