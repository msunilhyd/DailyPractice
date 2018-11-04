package com.linus.DailyPractice.list;

import java.util.Stack;

public class PalindromeList {
	
	public static void main(String[] args) {
	
		charNode node1 = new charNode('l');
		charNode node2 = new charNode('i');
		charNode node3 = new charNode('r');
		charNode node4 = new charNode('i');
		charNode node5 = new charNode('l');
		
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		System.out.println(isPalindrome(node1));
	}
	
	private static boolean isPalindrome(charNode head)
	{
		Stack<Character> stack = new Stack<>();
		int length = 0;
		charNode temp = head;
		while(temp != null)
		{
			length += 1;
			temp = temp.next;
		}
		
			temp = head;
			int count = 0;
			while(count <= length/2 )
			{
				stack.push(temp.data);
				temp = temp.next;
				count++;
			}
			if(stack.size() % 2 != 0)
			{
				stack.pop();
				temp = temp.next;
			}
			while(temp != null && !stack.empty())
			{
				System.out.println(temp.data + " : " + stack.peek());
				if(temp.data == stack.pop())
				{
					temp = temp.next;
				}
				else
					return false;
			}
			return true;
		
	}
}


class charNode
{
	char data;
	charNode next;

	public charNode(char data) {
		super();
		this.data = data;
		this.next = null;
	}
}