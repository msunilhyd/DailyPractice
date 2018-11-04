package com.linus.DailyPractice.list;

public class LoopInAList {
	
	public static void main(String[] args) {
		
		Node node1 = new Node(8);
		Node node2 = new Node(1);
		Node node3 = new Node(9);
		Node node4 = new Node(4);
		Node node5 = new Node(2);
		
		Node node6 = new Node(3);
		Node node7 = new Node(7);
		Node node8 = new Node(9);
		Node node9 = new Node(8);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node6;
		findStartNodeOfLoop(node1);	
	}
	
	private static Node findStartNodeOfLoop(Node head)
	{
		Node s = head.next;
		Node f = head.next.next;
		
		while(s != f)
		{
			s = s.next;
			f = f.next.next;
		}
		s = head;
		while(s != f)
		{
			s = s.next;
			f = f.next;
		}
		
		System.out.println(" loop occurs at : " + s.data);
		return s;
		
	}
}
