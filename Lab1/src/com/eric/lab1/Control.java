package com.eric.lab1;

/**
 * @author Eric Strong Date: 2 Feb 2017 Lab: ID: C15708709
 */
public class Control
{
	public static void main(String[] args)
	{
		// instantiate 3 person objects
		Person p1 = new Person("Eric", 27, true);
		Person p2 = new Person("Laura");
		Person p3 = new Person();

		// result in memory addresses because of no toString method
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		// after adding the toString method the representation because a string

		/*
		 * PART 2 - vehicle class
		 */

		// using constructor 1
		Vehicle car1 = new Vehicle("Eric");
		// using constructor 2
		Vehicle car2 = new Vehicle("Laura", "07D79415", 128.500f, 120.5f, "Blue", false, 4);
		Vehicle car3 = new Vehicle("Dave", "11D8815", 250000.400f, 160.5f, "Green", true, 4);

		// printing out objects
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);

		// PART 4 - encapsulation
		// System.out.println(car3.regNumber); THIS DOES NOT COMPILE AS
		// ATTRIBUTES ARE SET TO PRIVATE - NEED SETTESR AND GETTERS

		// we can now access the attributes via getter method
		System.out.println(car3.getOwnerName());

		// PART 5
		car3.resetMileage();
		System.out.println(car3.getMileage());
		car2.resetMileage(15.500f);

	}// end main

}// end class
