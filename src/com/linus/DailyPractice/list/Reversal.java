package com.linus.DailyPractice.list;

import java.util.Currency;

public class Reversal
{
	private static Node head = null;
	
	public static void main(String[] args) {
	
		
		push(35);
		push(25);
		push(0);
		push(17);
		push(13);
		
		//printList(head);
		//head = reverseInGrps(head,3);
		//deleteLastNode(head);
		
		//Node newHead = reverse(head);
		
		printList(head);
		//head = deleteElemsLessThan15(head);
		printList(head);
		
	}
	
/*
	private static Node deleteElemsLessThan15(Node head)
	{
		Node curr = head;
		while(curr != null)
		{
			Node temp = curr;
			if(temp.data < 15)
			{
				while(temp.data < 15)
				{
					temp = temp.next;
				}
				curr = temp;
				return head;
			}
			Node prev = temp;
			while(temp != null && temp.data < 15)
			{
				prev = temp;
				temp = temp.next;
			}
			while(temp != null && temp.data >= 15)
			{
				temp = temp.next;
			}
			prev.next = temp;
			prev = temp;
			curr = temp.next;
		}
	}
	
	*/
	private static void deleteLastNode(Node head)
	{
		Node temp = head;
		Node prev = head;
		while(temp.next != null)
		{
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}
	
	private static Node reverseInGrps(Node head, int k)
	{
		Node curr = head;
		Node next = null;
		Node prev = null;
		
		int count = 0;
		
		while(curr != null && count < k)
		{	
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count += 1;
		}
		
		if(curr != null)
			head.next = reverseInGrps(curr, k);
		
		return prev;
	}
	
	
	private static Node reverse(Node head)
	{

		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr != null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
		return head;
	}
	
	private static void printList(Node head)
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void push(int data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			head = node;
			return;
		}
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = node;		
	}
}

class Node
{
	int data;
	Node next;
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
