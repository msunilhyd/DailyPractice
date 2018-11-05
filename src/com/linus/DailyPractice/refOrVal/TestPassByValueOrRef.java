package com.linus.DailyPractice.refOrVal;

public class TestPassByValueOrRef 
{
	public static void main(String[] args) 
	{
		Pizza pizza = new Pizza("Mexicana");
		System.out.println("isCheese Pizza : " + pizza.isHasCheese());
		pizza = setCheese(pizza);
		System.out.println("Name of Pizza : " + pizza.getName());

	}
	
	public static Pizza setCheese(Pizza pizza)
	{
		pizza.setHasCheese(true);
		Pizza chickenbarbarian = new Pizza("ChickenBarbarian");
		return chickenbarbarian;
	}
}

class Pizza
{
	String name;
	boolean hasCheese;
	
	
	public Pizza(String name) {
		super();
		this.name = name;
		this.hasCheese = false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHasCheese() {
		return hasCheese;
	}
	public void setHasCheese(boolean hasCheese) {
		this.hasCheese = hasCheese;
	}
}
