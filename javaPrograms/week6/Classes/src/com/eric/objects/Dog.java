package com.eric.objects;

public class Dog
{
	private String name;
	private int age;
	private String colour;
	private String breed;
	private char fav;
	private double size;

	// constructor
	public Dog(String newName, int newAge, String newColour, String newBreed)
	{
		name = newName;
		age = newAge;
		colour = newColour;
		breed = newBreed;

	}

	public void setName(String newName)
	{
		this.name = newName;

	}// end setName

	public String getName()
	{
		return name;

	}// end getName

	public void setAge(int newAge)
	{
		this.age = newAge;
	}

	public int getAge()
	{
		return age;
	}

	public void setColour(String newColour)
	{
		this.colour = newColour;

	}

	public String getColour()
	{
		return colour;

	}

	public void setBreed(String newBreed)
	{
		this.breed = newBreed;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setFav(char newFav)
	{
		this.fav = newFav;
	}

	public char getFav()
	{
		return fav;
	}

	public void setSize(double newSize)
	{
		this.size = newSize;

	}

	public double getSize()
	{
		return size;
	}

}
