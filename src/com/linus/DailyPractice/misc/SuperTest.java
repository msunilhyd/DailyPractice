package com.linus.DailyPractice.misc;

public class SuperTest
{
	public static void main(String[] args) 
	{
		Item item = new Pen(12, "Reynolds");
		System.out.println(item.toString());
	}
}	
	class Item
	{
		int id;
		String name;
		public Item(int id, String name)
		{
			this.id = id;
			this.name = name;
		}
	}
	
	class Pen extends Item
	{
		public Pen(int id, String name) {
			super(id, name);
		}
		
		@Override
		public String toString() {
			return this.id + ", " + this.name;
		}
	}

