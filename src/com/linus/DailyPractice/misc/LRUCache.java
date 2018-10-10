
package com.linus.DailyPractice.misc;

import java.util.HashMap;

import com.linus.DailyPractice.node.Node;

public class LRUCache
{
	private Node left;
	private Node right;
	
	private HashMap<Integer, Node> lruMap;
	
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


	public HashMap<Integer, Node> getLruMap() {
		return lruMap;
	}


	public void setLruMap(HashMap<Integer, Node> lruMap) {
		this.lruMap = lruMap;
	}	
	
	public static void main(String[] args) 
	{
		
	}
}

