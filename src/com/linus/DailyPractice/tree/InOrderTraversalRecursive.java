package com.linus.DailyPractice.tree;

public class InOrderTraversalRecursive 
{
	public static void main(String[] args) 
	{
		Node root = new Node(15);
		Node rootLeft = new Node(33);
		Node rootRight = new Node(20);
		root.setLeft(rootLeft);
		root.setRight(rootRight);
		
		
		Node lLeft = new Node(8);
		Node lRight = new Node(13);
		rootLeft.setLeft(lLeft);
		rootRight.setRight(lRight);
		
		Node rLeft = new Node(14);
		Node rRight = new Node(30);
		rootRight.setLeft(rLeft);
		rootRight.setRight(rRight);
		
		printInorder(root);
	}
	
	private static void printInorder(Node root)
	{
		if(root == null)
			return;
		printInorder(root.left);
		System.out.println(root.data);
		printInorder(root.right);
	}
}
