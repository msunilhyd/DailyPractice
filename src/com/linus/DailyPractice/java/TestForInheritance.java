package com.linus.DailyPractice.java;

public class TestForInheritance {

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
		v.goo();
		
		Vehicle v2 = new Car();
		
		v2.goo();
		
		Vehicle v1 = null;
		
		v1.foo();
		
		//v1.m1();
		//v.painting(); 	// compile time error because the parent ref v 
						// does not have the child's extra methods
		
		//Car car = new Vehicle(); // compile time error, because car's extra methods 
								 // other than inherited from Vehicle need to be
								// defined (behaviour) for car object.
		//car.painting();
	}
	
}



class Vehicle
{
	public void m1() {
		System.out.println("Servicing Vehile");
	}
	
	public static void foo()
	{
		System.out.println("Vehicle");
	}
	
	public void goo()
	{
		System.out.println("Vehicle");
	}
}

class Car extends Vehicle
{
	@Override
	public void goo() {
		System.out.println("Car");
	}
	
	public void m1() {
		
		System.out.println("Servicing Car");
	}

	public static void foo()
	{
		System.out.println("Vehicle");
	}
	
	public void painting()
	{
		System.out.println("Painting Car");
	}
	
}