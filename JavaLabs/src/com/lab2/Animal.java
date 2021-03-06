/*
 * Lab 2- Objects, and classes and constructors
 * Author: Eric Strong
 * Date:
 */
package com.lab2;

public class Animal
{
	// public attributes
	private static int number = 0;
	private String name;
	private String breed;
	private int legs = 0;
	private char domesticated;
	private String colour;

	// constructor 1
	public Animal(String name)
	{
		number++;
		this.name = name;

		System.out.printf("\n%d. This Animal's name is %s\n", this.number, this.name);

	}

	// Constructor 2
	public Animal(String name, String breed, int legs, char dom, String colour)
	{
		number++;
		this.name = name;
		this.breed = breed;
		this.legs = legs;
		this.domesticated = dom;
		this.colour = colour;

		System.out.printf(
				"\n%d. This Animal is a %s, it's name is %s, it has %d legs.\n domesticated:[%c]\n" + "Colour:%s\n",
				this.number, this.breed, this.name, this.legs, this.domesticated, this.colour);

	}

	// part 3 getters and setters
	public void setName(String name)
	{
		this.name = name;
	}

	public int getLegs()
	{
		return legs;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public String getName()
	{
		return name;
	}

	public String getBreed()
	{
		return breed;
	}

	public char getDomesticated()
	{
		return domesticated;
	}

	public String getColour()
	{
		return colour;
	}

	public void setDomesticated(char dom)
	{
		this.domesticated = dom;
	}

	public void setNumberOfLegs(int num)
	{
		this.legs = num;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public void setColour(String colour)
	{
		this.colour = colour;
	}

	// part 4 Overloading
	public void makeNoise()
	{
		if (breed.equalsIgnoreCase("dog"))
		{
			System.out.println("woof!");
		}

		else if (breed.equalsIgnoreCase("cat"))
		{
			System.out.println("meow!");
		}

		else if (breed.equalsIgnoreCase("cow"))
		{
			System.out.println("mooo!");
		}

	}

	// part 5
	public void makeNoise(String volume)
	{
		if (breed.equalsIgnoreCase("dog"))
		{
			System.out.println("WOOF!");
		}

		else if (breed.equalsIgnoreCase("cat"))
		{
			System.out.println("MEOW!");
		}

		else if (breed.equalsIgnoreCase("cow"))
		{
			System.out.println("MOOOO!");
		}

	}// end makeNoise

}// end class
