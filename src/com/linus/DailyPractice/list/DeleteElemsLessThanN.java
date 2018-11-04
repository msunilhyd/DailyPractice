package com.linus.DailyPractice.list;

public class DeleteElemsLessThanN {

	static Node head = null;
	static int n;
	
	public static void main(String[] args) {
		
		push(3);
		push(2);
		push(7);
		push(8);
		push(1);
		push(6);
		
		n = 4;
		printList();
		deleteElemsLessThanN();
		printList();
	}
	
	private static void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	private static void push(int e)
	{
		Node node = new Node(e);
		if(head == null)
			head = node;
		else
		{
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}
	
	private static void deleteElemsLessThanN()
	{
		if(head == null)
			return;
		
		Node temp = head;
		Node prev = head;
		if(head.data < 4)
		{
			temp = temp.next;
			while(temp != null && temp.data < 4)
				temp = temp.next;
			head = temp;
		}
			while(temp != null)
			{
				prev = temp;
				temp = temp.next;
				if(temp != null && temp.data < 4)
				{
					while(temp.data < 4 && temp != null)
					{
						temp = temp.next;
					}
					prev.next = temp;
				}
			}
		
	}
	
}
