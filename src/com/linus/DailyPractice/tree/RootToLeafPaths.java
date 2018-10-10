package com.linus.DailyPractice.tree;

public class RootToLeafPaths
{
	public static void main(String[] args) 
	{
		Node root = new Node(15);
		Node rootLeft = new Node(12);
		Node rootRight = new Node(20);
		root.setLeft(rootLeft);
		root.setRight(rootRight);
		
		Node lLeft = new Node(8);
		Node lRight = new Node(13);
		rootLeft.setLeft(lLeft);
		rootLeft.setRight(lRight);
		
		Node rLeft = new Node(14);
		Node rRight = new Node(30);
		rootRight.setLeft(rLeft);
		rootRight.setRight(rRight);
		
		int[] path = new int[1000];
		printRootToLeafPaths(root, path, 0);
	}
	
	public static void printRootToLeafPaths(Node node, int path[], int pathLength)
	{
		if(node == null)
			return;
		else
		{
			path[pathLength] = node.getData();
			pathLength += 1;
			if(node.left == null && node.right == null)
			{
				printPath(path, pathLength);
			}
			else
			{
				printRootToLeafPaths(node.left, path, pathLength);
				printRootToLeafPaths(node.right, path, pathLength);
			}
		}
	}
	
	public static void printPath(int[] path, int len)
	{
		for(int i=0;i<len;i++)
		{
			System.out.print(path[i] + ", ");
		}
		System.out.println();
	}
}
