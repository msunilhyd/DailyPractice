package com.linus.DailyPractice.tree;

public class BSTOrNot
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
		
		System.out.println(isBST(root));
	}
	
	public static boolean isBST(Node root)
	{
		if(root == null)
		{
			return true;
		}
		
			if(root.left != null && (root.left.getData() > root.getData()))
			{
				return false;
			}
			if(root.right != null && (root.right.getData() < root.getData()))
			{
				return false;
			}
			if(!isBST(root.left) || !isBST(root.right))
					return false;
			
			return true;
	}
}


class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int data)
	{
		this.data = data;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}