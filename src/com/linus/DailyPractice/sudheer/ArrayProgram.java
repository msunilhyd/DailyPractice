package com.linus.DailyPractice.sudheer;

public class ArrayProgram
{
	char[] dataArray;
	int num_Of_Vowels;
	char[] vovelArray = {'a', 'e', 'i', 'o', 'u'};
						
	public int getCountOfVowels()
	{
		int count = 0;
		for(int i=0;i<dataArray.length;i++)
		{
			for(int j=0;j<vovelArray.length;j++)
			{
				if(dataArray[i] == vovelArray[j])
				{
					count = count + 1;
				}
			}
		}
		return count;	
	}
	
	
	public char[] getDataArray() {
		return dataArray;
	}

	public void setDataArray(char[] dataArray) {
		this.dataArray = dataArray;
	}
	
	public void printArray()
	{
		for(int i=0;i<dataArray.length;i++)
		{
			System.out.print(dataArray[i] + ",");
		}
	}
	
	public void reverseArray()
	{
		int i = 0;
		int j = dataArray.length - 1;
		while(i < j)
		{
			char temp = dataArray[i];
			dataArray[i] =  dataArray[j];
			dataArray[j] = temp;
			i = i + 1;
			j = j - 1;
		}
	}
}
