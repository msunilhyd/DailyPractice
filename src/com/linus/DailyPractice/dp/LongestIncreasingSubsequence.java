package com.linus.DailyPractice.dp;

public class LongestIncreasingSubsequence 
{
	public static void main(String[] args) {
		LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
		int[] dataArr = {5,1,2,9,0};
		longestIncreasingSubsequence.setDataArr(dataArr);
		System.out.println("Length of the longest increasing subsequence is : " + longestIncreasingSubsequence.getLengthOfincreasingSebSequence());
	}
	
	int[] dataArr;

	public int getLengthOfincreasingSebSequence()
	{
		if(dataArr.length == 0)
			return 0;

		if(dataArr.length == 1)
			return 1;
		
		int[] maxlengthArr = new int[dataArr.length];
		
		maxlengthArr[0] = 1;
		for(int i=0;i<maxlengthArr.length;i++)
		{
			maxlengthArr[i] = 1;
		}
		
		for(int i=1;i<dataArr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(dataArr[i] > dataArr[j])
				{
					if((maxlengthArr[j] + 1) > maxlengthArr[i])
						maxlengthArr[i] = maxlengthArr[j] + 1;
				}
			}
		}
		int max = maxlengthArr[0];

		for(int i=0;i<maxlengthArr.length;i++)
		{
			if(max < maxlengthArr[i])
				max = maxlengthArr[i];
		}
		
		return max;
	}
	
	public int[] getDataArr() {
		return dataArr;
	}

	public void setDataArr(int[] dataArr) {
		this.dataArr = dataArr;
	}
	
}
