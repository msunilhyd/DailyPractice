package com.linus.DailyPractice.array;

import java.util.NoSuchElementException;

public class MyDynamicArray<T>
{
	private int positionPointer=0;
	private int arraySize;
	private T[] dynamicArray;
	private static final int DEFAULT_ARRAY_SIZE = 10;
	
	
	
	public MyDynamicArray(int arraySize) 
	{
		this.arraySize = arraySize;
		dynamicArray = (T[]) new Object[arraySize];
	}
	
	public void addElement(T element)
	{
		dynamicArray[positionPointer] = element;
		positionPointer++;
	}
	
	public void addElementAtNode(int index, T element)
	{
		if(index < positionPointer)
		{
			dynamicArray[index] = element;
		}
		else
		{
			addElement(element);
		}
	}
	
	private void adjustSize()
	{
		if(positionPointer == arraySize)
		{
			increaseSize();
		}
		else if(positionPointer == arraySize/4 - 1)
		{
			decreaseSize();
		}
	}
	
	private void increaseSize()
	{
		T[] tempArray = (T[]) new Object[2*arraySize];
		for(int i=0;i<dynamicArray.length;i++)
		{
			tempArray[i] = dynamicArray[i];
		}
		dynamicArray = tempArray;
		arraySize = 2 * arraySize;
	}
	
	private void decreaseSize()
	{
		T[] tempArray = (T[]) new Object[arraySize/4];
		for(int i=0;i<dynamicArray.length;i++)
		{
			tempArray[i] = dynamicArray[i];
		}
		dynamicArray = tempArray;
		arraySize = arraySize/4;
	}
	
	public int searchElement(T element)
	{
		for(int i=0;i<positionPointer;i++)
		{
			if(dynamicArray[i] ==  element)
				return i;
		}
		throw new NoSuchElementException();
	}
	
	public T getElementAtIndex(int index)
	{
		if(index < positionPointer)
		{
			return dynamicArray[index];
		}
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public void removeElementatIndex(int index)
	{
		if(index < positionPointer)
		{
			for(int i=index;i<positionPointer-1;i++)
			{
				dynamicArray[i] = dynamicArray[i+1];
			}
			dynamicArray[positionPointer-1] = null;
			positionPointer--;
			adjustSize();
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public int size()
	{
		return positionPointer;
	}
}
