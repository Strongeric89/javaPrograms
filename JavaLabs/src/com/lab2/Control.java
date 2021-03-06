/**
 * @author Eric
 * Date: 15 Dec 2016
 * Lab: 2
 */
package com.lab2;

public class Control
{
	public static void main(String[] args)
	{
		// creating instance of the class Animal
		Animal leo = new Animal("Leo");

		// creating second instance of animal
		Animal spot = new Animal("Spot", "dog", 4, 'Y', "Brown");

		Animal prince = new Animal("prince");
		Animal princess = new Animal("princess");
		Animal banger = new Animal("banger");

		// // part 2 encapsulation
		// System.out.println(leo.name);
		// System.out.println(prince.name);
		//
		// // change banger name to BANGER
		// banger.name = "BANGER";
		// System.out.println(banger.name);
		/*
		 * when attributes marked private and try to access them the compiler
		 * gives out so I have commented out part 2. just for test purposes
		 */

		// part 3 setting the values
		prince.setName("PRINCE");
		System.out.println(prince.getName());

		princess.setName("WOBBLY");
		System.out.println(princess.getName());

		// part 4
		Animal milky = new Animal("Milky", "Cow", 4, 'N', "White/Black");
		Animal bubbles = new Animal("Bubbles", "Cat", 3, 'Y', "ginger");

		spot.makeNoise();
		milky.makeNoise();
		bubbles.makeNoise();

		milky.makeNoise("loud");
	}// end main

}// end class
