package com.linus.DailyPractice.tree;

public class HeighOfBST
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
		
		System.out.println(getHeight(root));
	}
	
	private static int getHeight(Node root)
	{
		if(root == null)
			return 0;
		int leftHeight = 1 + getHeight(root.left);
		int rightHeight = 1 + getHeight(root.right);
		if(leftHeight > rightHeight)
		{
			return leftHeight;
		}
		return rightHeight;
	}
}
