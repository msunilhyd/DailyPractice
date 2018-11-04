package com.linus.DailyPractice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Heap
{	
	public static void main(String[] args) 
	{
		Heap heap = new Heap();
		heap.add(3);
		heap.add(5);
		heap.add(4);
		heap.add(12);
		heap.add(6);
		heap.add(89);
		
		heap.heapSort();
	}
	
	private void heapSort()
	{
		while(items.size() > 0)
			delete();
	}
	
	public Heap()
	{
		items = new ArrayList<>();
	}
	
	private ArrayList<Integer> items;
	
	private void add(int e)
	{
		items.add(e);
		siftUp();
		System.out.println(Arrays.toString(items.toArray()));
	}
	
	private void siftUp()
	{
		int k = items.size()-1;
		int p = (k-1)/2;
		
		while(k > 0)
		{
			int curr = items.get(k);
			int parent = items.get(p);
			
			if(curr > parent)
			{
				items.set(p, curr);
				items.set(k, parent);
				k = p;
				p = (k-1)/2;
			}
			else
				break;
		}
	}
	
	private void delete()
	{
		int max = items.get(0);
		System.out.println("max is : "+ max);
		int temp = items.get(items.size()-1);
		items.set(0, temp);
		items.remove(items.get(items.size()-1));
		siftDown();
		System.out.println(Arrays.toString(items.toArray()));
	}
	
	private void siftDown()
	{
		int k = 0;
		int l = 2*k +1;
		int max, r;
		while(l < items.size())
		{
			r = l + 1;
			max = l;
			if(r < items.size())
			{
				if(items.get(r) > items.get(l))
				{
					max = r;
				}
			}
			int parent = items.get(k);
			int child = items.get(max);
			
			if(child > parent)
			{				
				items.set(max, parent);
				items.set(k, child);
				
				k = max;
				l = 2*k +1;
			}
			else
				break;
		}
	}
}
