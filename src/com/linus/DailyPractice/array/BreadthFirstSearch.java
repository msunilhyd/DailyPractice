package com.linus.DailyPractice.array;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch 
{
	private int V; // No. of vertices
	private LinkedList<Integer> adj[]; // Adjacency Lists

	public BreadthFirstSearch(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) 
		{
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	
	public void BFS(int s)
	{
		// Create a boolean array for visited vertices, default to false
		boolean visited[] = new boolean[V];
		
		// Create a queue for Traversal
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		
		while(!queue.isEmpty())
		{
			s = queue.poll();
			System.out.println(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext())
			{
				int n = i.next();
				if(visited[n] ==  false)
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		BreadthFirstSearch bfs = new BreadthFirstSearch(4);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(2, 3);
		bfs.addEdge(3, 3);
		
		System.out.println("Following is the BFS starting from vertex 2 " );
		bfs.BFS(2);
	}
}
