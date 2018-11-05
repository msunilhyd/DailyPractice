package com.linus.DailyPractice.tree;

public class DistanceBetween2NodesBST {

	public static void main(String[] args) {
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
		
		Node node14 = new Node(14);
		Node node22 = new Node(22);
		
		lRight.right = node14;
		rRight.left = node22;
		
		//System.out.println("Distance of 13 from root is :  " + getDistanceFromRoot(root, 13));
		
		System.out.println("Distance between 14 and 22 is : " + getDistance(root, 14, 22));
	}
	
	
	private static int getDistance(Node root, int n1, int n2)
	{
		if(isLCA(root, n1, n2))
		{
			return getDistanceFromRoot(root, n1) + getDistanceFromRoot(root, n2);
		}
		
		int lca = getLCAIterative(root, n1, n2);
		int i = getDistanceFromRoot(root, n1);
		int j = getDistanceFromRoot(root, n2);
		
		return (i+j) - 2*lca;
		
	}
	
	private static boolean isLCA(Node root, int n1, int n2)
	{
		if((root.data > n1 && root.data < n2) ||(root.data > n2 && root.data < n1))
		{
			return true;
		}
		return false;
	}
	
	private static int getDistanceFromRoot(Node root, int n)
	{
		if(root == null || root.data == n)
			return 0;
		if(root.data < n)
			return 1 + getDistanceFromRoot(root.right, n);
		if(root.data > n)
			return 1 + getDistanceFromRoot(root.left, n);
		return 0;
	}
	
	private static int getLCAIterative(Node root, int n1, int n2)
	{
		while(root != null)
		{
			if(root.data > n1 && root.data > n2)
				root = root.left;
			if(root.data < n1 && root.data < n2)
				root = root.right;
			break;
		}
		return root.data;
	}
}
