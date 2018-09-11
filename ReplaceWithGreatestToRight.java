package com.linus.DailyPractice.array;

public class ReplaceWithGreatestToRight 
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
		for(int i=0;i<dataArr.length;i++)
		{
			System.out.print(dataArr[i] + ",");
		}
		System.out.println();
	}
	
	public void replaceWithGreatestToRight()
	{
		int max = dataArr[dataArr.length-1];
		for(int i=dataArr.length-1;i>=0;i--)
		{
			int temp = dataArr[i];
			dataArr[i] = max;
			if(temp> max)
			{
				max = temp;
			}
 		}
	}
	public static void main(String[] args) 
	{
		int[] dataArr = {8,3,11,5,7,1,6};
		ReplaceWithGreatestToRight replaceWithGreatestToRight = new ReplaceWithGreatestToRight();
		replaceWithGreatestToRight.setDataArr(dataArr);
		replaceWithGreatestToRight.printArr();
		replaceWithGreatestToRight.replaceWithGreatestToRight();
		replaceWithGreatestToRight.printArr();
	}
}
