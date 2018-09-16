package com.linus.DailyPractice.array;

//  Program Stmt = Given 2 sorted arrays one of size m + n whose n elementars are -1
//  and the other of size n, merge them into the m+n sized array.

import java.util.Arrays;

public class MPlusNMergeArrays 
{
	private int[] ArrMPlusN;
	private int[] ArrN;
	public int[] getArrMPlusN() {
		return ArrMPlusN;
	}
	public void setArrMPlusN(int[] arrMPlusN) {
		ArrMPlusN = arrMPlusN;
	}
	public int[] getArrN() {
		return ArrN;
	}
	public void setArrN(int[] arrN) {
		ArrN = arrN;
	}
	
	public void moveArrayMPlusN()
	{
		int i,j;
		int n = this.getArrMPlusN().length;
		j = n-1;
		
		for(i=n-1;i>=0;i--)
		{
			if(this.getArrMPlusN()[j] != -1)
			{
				j = j-1;
			}
			
			if(this.getArrMPlusN()[i] != -1 && i<j)
			{
				this.getArrMPlusN()[j] = this.getArrMPlusN()[i];
				this.getArrMPlusN()[i] = -1;
				j = j -1;
			}
		}
	}
	
	public void mergeArrays()
	{
		int mPlusN = this.getArrMPlusN().length;
		int n = this.getArrN().length;
		int j = 0;
		int i = n;
		
		while(i<mPlusN && j < n)
		{
			if(this.getArrMPlusN()[i] > this.getArrN()[j])
			{
				int k = i-1;
				while(k>=0 && this.getArrMPlusN()[k] != -1)
				{
					k = k-1;
				}
				int temp;
				for(temp=k;temp<i-1;temp++)
				{
					this.getArrMPlusN()[temp] = this.getArrMPlusN()[temp + 1];
				}
				this.getArrMPlusN()[temp - 1] = this.getArrN()[j];
				j = j + 1;
			}
			
			else
			{
				if(i < mPlusN-1)
				{
					int r;
					for(r=i+1;r<mPlusN;r++)
					{
						if(this.getArrMPlusN()[r] < this.getArrN()[j])
						{
							r = r+1;
						}
						else
						{
							break;
						}
					}
				}
				else
				{
					i = mPlusN-1;	
				}
				int k = i-1;
				
				while(k>=0 && this.getArrMPlusN()[k] != -1)
				{
					k = k-1;
				}
				int temp;
				for(temp=k;temp<=i-1;temp++)
				{
					this.getArrMPlusN()[temp] = this.getArrMPlusN()[temp + 1];
				}
				this.getArrMPlusN()[temp] = this.getArrN()[j];
				i = i+1;
				j = j+1;
			}
		}
		
		
	}
	
	public void printArrMPlusN()
	{
		System.out.println(Arrays.toString(this.getArrMPlusN()));
	}
	
	
	public void printArrN()
	{
		System.out.println(Arrays.toString(this.getArrN()));
	}
	
	
	public static void main(String[] args) 
	{
		MPlusNMergeArrays arrayObject = new MPlusNMergeArrays();
		int[] aMPlusN = {-1,3,-1,8,-1,10};
		int[] aN = {2,9,17};
		arrayObject.setArrN(aN);
		arrayObject.setArrMPlusN(aMPlusN);
		arrayObject.printArrMPlusN();
		arrayObject.moveArrayMPlusN();
		arrayObject.printArrMPlusN();
		arrayObject.printArrN();
		arrayObject.mergeArrays();
		arrayObject.printArrMPlusN();
	}
}
