//Program Stmt = Given a Sorted Array that is rotated :
// Say a[] = {8,10,17,52,3,5,6}, return the index at which it is rotated.
// i.e. return 4;


package com.linus.DailyPractice.array;

import java.util.Arrays;

public class SortedArrayRotated 
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
	
	public  int indexOfRotatedSortedArray()
	{
		int low = 0;
		int high = dataArr.length-1;
		int mid = (low+high)/2;
		
		if(dataArr[low] < dataArr[mid])
		{
			low = mid;
		}
		else
		{
			high = mid;
		}
		
		while(low!=high)
		{
			if(dataArr[low] > dataArr[high])
				high = high-1;
			else
				low = low + 1;
		}
		return low + 1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {8,10,11,12,13,14,2,3,5,6,7};
		SortedArrayRotated sortedArrayRotated = new SortedArrayRotated();
		sortedArrayRotated.setDataArr(arr);
		sortedArrayRotated.printArr();
		System.out.println(sortedArrayRotated.indexOfRotatedSortedArray());
	}
}
