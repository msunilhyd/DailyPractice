package com.linus.DailyPractice.array;

// Program Stmt = Binary Search


public class BinarySearch 
{
	private int[] dataArr;
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getDataArr() {
		return dataArr;
	}

	public void setDataArr(int[] dataArr) {
		this.dataArr = dataArr;
	}

	public int returnIdxOfNum(int low, int high)
	{
		
		if(low <= high)
		{
			int mid = (low + high)/2;
			if(dataArr[mid] == num)
			{
				return mid;
			}
			if(dataArr[mid] < num)
				returnIdxOfNum(mid, high);
			else
				returnIdxOfNum(low, mid);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {2,5,10,15,25,30,192};
		binarySearch.setDataArr(arr);
		binarySearch.setNum(5);
		System.out.println(binarySearch.returnIdxOfNum(0, binarySearch.getDataArr().length - 1));
	}
}