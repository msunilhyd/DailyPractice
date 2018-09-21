package com.linus.DailyPractice.tree;

import java.util.LinkedList;

public class LevelOrderTraversal
{
	class Node
	{
		int data;
		Node left;
		Node right;
		
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
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
	
	public void levelOrderTraversal(Node root)
	{
		if(root == null)
			return;
		LinkedList<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			Node node = queue.poll();
			if(node != null)
			{
				System.out.println(node.data);
				if(node.getLeft() != null)
				{
					queue.add(node.getLeft());
				}
				if(node.getRight() != null)
				{
					queue.add(node.getRight());
				}
			}
		}
	}
	
	public static void main(String[] args) 
	{
		LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
		Node root = levelOrderTraversal.new Node(1);
		root.setLeft(levelOrderTraversal.new Node(2));
		root.setRight(levelOrderTraversal.new Node(3));
		root.left.setLeft(levelOrderTraversal.new Node(4));
		root.left.setRight(levelOrderTraversal.new Node(5));
		
		levelOrderTraversal.levelOrderTraversal(root);
	}
}
