package com.linus.DailyPractice.array;

public class MissingNumInIncreasingSeq 
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7};
		System.out.println("Missing number is : " + findMissingNum(arr));
	}
	
	private static int findMissingNum(int[] arr){
		int low = 0;
		int high = arr.length-1;
		
		while(low < high)
		{
			int mid = (low+high)/2;
			if(arr[mid] == mid+1)
				low = mid+1;
			else
				high = mid;
		}
		if(low == arr.length-1 || low == 0)
			return -1;
		return low +1;
	}
}

