package com.linus.DailyPractice.array;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch 
{
	class Graph
	{
		private int V;
		private LinkedList<Integer> adjList[];
		private boolean[] visited;
		
		public Graph(int v)
		{
			V=v;
			visited = new boolean[v];
			adjList = new LinkedList[v];
			
			for(int i=0;i<v;i++)
			{
				adjList[i] =  new LinkedList<>();
				visited[i] = false;
			}
		}
		
		public void addEdge(int v, int w)
		{
			adjList[v].add(w);
		}
		
		public void DFS(int s)
		{
			visited[s] = true;
			System.out.print(s  + ", ");
			LinkedList<Integer> ithAdjList = adjList[s];
			Iterator<Integer> i = ithAdjList.listIterator();
			while(i.hasNext())
			{
				int n = i.next();
				if(visited[n] != true)
				{
					DFS(n);
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		DepthFirstSearch dfs = new DepthFirstSearch();
		Graph graph = dfs.new Graph(9);
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(0, 4);
		
		graph.addEdge(1, 5);
		graph.addEdge(1, 8);
		
		graph.addEdge(4, 3);
		graph.addEdge(4, 7);

		graph.addEdge(3, 6);
		
		graph.addEdge(2, 8);
		graph.addEdge(2, 6);
		
		graph.DFS(0);
	}
}
