package com.linus.DailyPractice.array;

public class IndexOfElemInRotatedSortedArr 
{
	public static void main(String[] args) 
	{
		int[] arr = {7,8,9,4,5,6};
		int pivot = findPivot(arr, 0, arr.length-1);
		int n = 8;
		System.out.println("Pivot is at :" + pivot);
		if(pivot>=0)
		{
			if(n >= arr[0] && n<=arr[pivot-1])
				System.out.println("Index of " + n +"  is : " + binarySearchForIndex(arr, 0, pivot-1, n));
			else
				System.out.println("Index of " + n +"is : " + binarySearchForIndex(arr, pivot, arr.length-1, n));
		}
	}
	
	
	
	private static int findPivot(int[] arr, int low, int high)
	{
		if(arr.length <= 1)
			return -1;
			
		int mid = (low + high)/2;
		if(isPivot(arr, mid))
		{
			return mid + 1;
		}
		while(low <= high)
		{
			if(arr[low] <= arr[mid])
				return findPivot(arr, mid+1, high);
			else
				return findPivot(arr, low, mid);
		}
		return -1;
	}
	
	private static boolean isPivot(int[] arr, int mid)
	{
		if(arr[mid] > arr[mid+1])
			return true;
		else
			return false;
	}
	
	
	private static int binarySearchForIndex(int[] arr, int low, int high, int n)
	{
		int mid = (low+high)/2;
		if(arr[mid] == n)
			return mid;
		if(n <= arr[mid] && n>=arr[low])
			return binarySearchForIndex(arr, low, mid, n);
		else if(n> arr[mid] && n<=arr[high])
			return binarySearchForIndex(arr, mid, high, n);	
		
		return -1;
	}
}
