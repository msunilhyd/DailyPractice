package com.linus.DailyPractice.tree;

public class DistanceBetween2NodesBinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(1);
		Node rootLeft = new Node(2);
		Node rootRight = new Node(3);
		root.setLeft(rootLeft);
		root.setRight(rootRight);
		
		Node lLeft = new Node(4);
		Node lRight = new Node(5);
		rootLeft.setLeft(lLeft);
		rootLeft.setRight(lRight);
		
		Node rLeft = new Node(6);
		Node rRight = new Node(7);
		rootRight.setLeft(rLeft);
		rootRight.setRight(rRight);	
		
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		
		lRight.left = node8;
		rLeft.left = node9;
		
		//System.out.println("LCA of 6 and 7 is " + LCA(root, 6, 7));
		
		System.out.println("Distance of 6 from root is : " + distanceFromRoot(root, 6, 0));
	}
	
	private static int distanceFromRoot(Node root, int n1, int level)
	{
		if( root == null)
			return -1;
		
		if(root.data == n1)
			return level;
		
		int lDist = distanceFromRoot(root.left, n1, level + 1);
		int rDist = distanceFromRoot(root.right, n1, level + 1);
		if(lDist > rDist)
			return lDist;
		return rDist;
	}
	
	
	private static int LCA(Node root, int n1, int n2)
	{
		if(root == null)
			return 0;
		if(root.data == n1 || root.data == n2)
			return root.data;
		
		int lcaLeft = LCA(root.left, n1, n2);
		int lcaRight = LCA(root.right, n1, n2);
		
		if(lcaLeft != 0 && lcaRight != 0)
		{
			return root.data;
		}
		
		if(lcaLeft > 0)
			return lcaLeft;
		if(lcaRight > 0 )
			return lcaRight;
	return 0;
	}
}
