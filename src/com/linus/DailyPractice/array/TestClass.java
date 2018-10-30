package com.linus.DailyPractice.array;

import java.util.LinkedList;
import java.util.Scanner;

public class TestClass
{
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists
	
	 int[] prodArray = new int[V];
     int[] managerArray = new int[V];
     
	public TestClass(int v, int[] prodArray, int[] managerArray)
	{
		this.V = v;
		this.adj = new LinkedList[v];
		for(int i=0;i<v;i++) 
		{
			adj[i] = new LinkedList<>();
		}
		this.prodArray = prodArray;
		this.managerArray = managerArray;
	}
	
	public void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	public int getProductivity()
	{
		int maxProd = prodArray[0];
		for(int i=1;i<adj.length;i++)
		{
			if(prodArray[i] > prodArray[adj[i].get(0)])
			{
				prodArray[i] = prodArray[adj[i].get(0)];
			}
			maxProd += prodArray[i];
		}
		return maxProd;
	}
	
	
	public static void main(String[] args) 
	{
		
	    Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        String[] arr = name.split(" ");
        
        int numOfEmpl = Integer.parseInt(arr[0]);
        
        int[] prodArray = new int[numOfEmpl];
        int[] managerArray = new int[numOfEmpl];
        
        for(int i=0;i<numOfEmpl;i++)
        {
            String prodAndManager = s.nextLine();
            String[] prodAndManagerArr = prodAndManager.split(" ");
            prodArray[i] = Integer.parseInt(prodAndManagerArr[0]);
            managerArray[i] = Integer.parseInt(prodAndManagerArr[1]);
        }
        s.close();
		
        TestClass productivity = new TestClass(numOfEmpl,prodArray,managerArray);
        for(int i=0;i<numOfEmpl;i++)
        {
            productivity.addEdge(i, managerArray[i]);
        }
        
		
		System.out.println(productivity.getProductivity());
	}
}
