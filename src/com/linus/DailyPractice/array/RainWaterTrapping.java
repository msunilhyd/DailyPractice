package com.linus.DailyPractice.array;

public class RainWaterTrapping {

	public static void main(String[] args) {
		
		int[] towerHeightsSample = {2,4,1,3,5,2};
		RainWaterTrapping rainWaterTrapping = new RainWaterTrapping(towerHeightsSample);
		rainWaterTrapping.setTotalRainWaterCount();
		
		System.out.println("Total rainwater stored is : " + rainWaterTrapping.rainWaterUnitsCount);
	}
	
	
	private int[] towerHeights;
	private int rainWaterUnitsCount;
	
	public RainWaterTrapping(int[] towerHeights) {
		super();
		this.towerHeights = towerHeights;
	}
	
	private void setTotalRainWaterCount()
	{
		int[] maxSeenRightHeights = new int[towerHeights.length];
		
		int maxSeenRightSoFar = 0;
		
		for(int i=towerHeights.length-1; i>=0;i--)
		{
			if(towerHeights[i] > maxSeenRightSoFar)
			{
				maxSeenRightSoFar = towerHeights[i];
			}
			maxSeenRightHeights[i] = maxSeenRightSoFar;
		}
		
		int maxSeenLeftSoFar = 0;
		int rainWaterTotCount = 0;
		
		for(int i=0;i<towerHeights.length;i++)
		{
			int currentCount =  Integer.min(maxSeenLeftSoFar, maxSeenRightHeights[i]) - towerHeights[i];
			rainWaterTotCount += Integer.max(currentCount, 0);
			if(towerHeights[i] > maxSeenLeftSoFar)
			{
				maxSeenLeftSoFar = towerHeights[i];
			}
		}
		
		rainWaterUnitsCount = rainWaterTotCount;
	}
}
