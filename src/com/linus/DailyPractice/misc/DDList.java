package com.linus.DailyPractice.misc;

public class DDList 
{
	Node head = null;
	Node tail = null;
	
	public void push(Node node)
	{
		if(head == null)
		{
			head = node;
		}
		else
		{
			node.left = null;
			node.right = head;
			head = node;
		}
	}
	
	public void putAtTail(Node node)
	{
		node.left.right = node.right;
		node.right.left = node.left;
	}
}

class Node
{
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		super();
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
