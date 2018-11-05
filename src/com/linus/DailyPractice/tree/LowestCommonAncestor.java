package com.linus.DailyPractice.tree;

public class LowestCommonAncestor {

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
		
		//System.out.println( getLCA(root, lLeft, lRight).data );
		System.out.println(getLCAIterative(root, 8, 20));
		
	}
	
	private static Node getLCA(Node root, Node node1, Node node2)
	{
		if(root == null)
			return null;
		
		if(root.data > node1.data && root.data > node2.data)
		{
			return getLCA(root.left, node1, node2);
		}
		if(root.data < node1.data && root.data < node2.data)
		{
			return getLCA(root.right, node1, node2);
		}
		
		return root;
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
