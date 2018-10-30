package com.linus.DailyPractice.tree;

import java.util.Stack;

public class InorderTraversalIterative
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
		
		Node rLeft = new Node(16);
		Node rRight = new Node(30);
		rootRight.setLeft(rLeft);
		rootRight.setRight(rRight);	
		
		printInorderIterative(root);
	}
	
	private static void printInorderIterative(Node root)
	{
		Node current = root;
		Stack<Node> stack = new Stack<>();
		
		while(current != null || !stack.empty())
		{	
			while(current != null)
			{
				stack.add(current);
				current = current.left;
			}
			
			current = stack.pop();
			System.out.println(current.data);
			current = current.right;
		}
	}
}
