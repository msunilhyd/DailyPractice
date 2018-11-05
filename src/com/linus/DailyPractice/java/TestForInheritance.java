package com.linus.DailyPractice.java;

public class TestForInheritance {

	public static void main(String[] args) {
	
		Vehicle v = new Car();
		Vehicle v1 = null;
		v1.m1();
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
}

class Car extends Vehicle
{
	public void m1() {
		
		System.out.println("Servicing Car");
	}
	
	public void painting()
	{
		System.out.println("Painting Car");
	}
	
}