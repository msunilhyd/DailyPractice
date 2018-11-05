// Program Stmt = Given an array, Reverse it in groups of k.
// say arr[] = {3,8,2,5,9,1,6,4};
// return [2, 8, 3, 1, 9, 5, 4, 6];

package com.linus.DailyPractice.array;

import java.util.Arrays;

public class ReverseInGroupsOfK 
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
	
	
	
	public void reverseInGrps(int k)
	{
		for(int i=0; i<dataArr.length; i=i+k)
		{
			int low = i;
			int high = low + k -1;
			if(high >= dataArr.length-1) 
			{
				high= dataArr.length -1;
			}
			reverse(low, high);
		}
	}
	
	public void reverse(int low, int high)
	{
		while(low < high)
		{
			int temp = dataArr[low];
			dataArr[low] = dataArr[high];
			dataArr[high] = temp;
			low += 1;
			high -=1;
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr = {3,8,2,5,9,1,6,4};
		ReverseInGroupsOfK reverseInGroupsOfK = new ReverseInGroupsOfK();
		reverseInGroupsOfK.setDataArr(arr);
		reverseInGroupsOfK.printArr();
		reverseInGroupsOfK.reverseInGrps(3);
		reverseInGroupsOfK.printArr();
	}
}
