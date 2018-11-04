package com.linus.DailyPractice.dp;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LongestIncreasingSubsequence 
{
	public static void main(String[] args) {
		LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
		int[] dataArr = {5,1,2,9,0};
		longestIncreasingSubsequence.setDataArr(dataArr);
		LinkedList<Integer> listEntries[] = new LinkedList[dataArr.length];
		longestIncreasingSubsequence.setLISAti(listEntries);
		System.out.println("Length of the longest increasing subsequence is : " + longestIncreasingSubsequence.getLengthOfincreasingSebSequence());
	}
	
	int[] dataArr;
	LinkedList<Integer> LISAti[];

	
	public LinkedList<Integer>[] getLISAti() {
		return LISAti;
	}

	public void setLISAti(LinkedList<Integer>[] lISAti) {
		this.LISAti = lISAti;
	}

	public int getLengthOfincreasingSebSequence()
	{
		if(dataArr.length == 0)
			return 0;

		if(dataArr.length == 1)
			return 1;
		
		int[] maxlengthArr = new int[dataArr.length];
		
		maxlengthArr[0] = 1;
		
		
		if(LISAti == null)
			System.out.println("Hi");
		
		for(int i=0;i<maxlengthArr.length;i++)
		{
			maxlengthArr[i] = 1;
			LISAti[i] = new LinkedList<>();
			LISAti[i].add(dataArr[i]);
		}
		
		for(int i=1;i<dataArr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(dataArr[i] > dataArr[j])
				{
					if((maxlengthArr[j] + 1) > maxlengthArr[i])
					{
						maxlengthArr[i] = maxlengthArr[j] + 1;
						LISAti[i].addAll(LISAti[j]);
					}
				}
			}
		}
		
		int max = maxlengthArr[0];
		int k = 0;
		for(int i=0;i<maxlengthArr.length;i++)
		{
			if(max < maxlengthArr[i])
			{
				max = maxlengthArr[i];
				k = i;
			}
		}
		
		Collections.sort(LISAti[k]);
		System.out.println(Arrays.toString(LISAti[k].toArray()));
		
		return max;
	}
	
	public int[] getDataArr() {
		return dataArr;
	}

	public void setDataArr(int[] dataArr) {
		this.dataArr = dataArr;
	}
	
}
