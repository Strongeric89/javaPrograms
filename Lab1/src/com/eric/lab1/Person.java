package com.eric.lab1;

/**
 * @author Eric Date: 2 Feb 2017 Lab:
 */
public class Person
{
	private String name;
	private int age = 0;
	private boolean isHealthy = true;

	// default constructor
	public Person()
	{

	}

	// constructor 2
	public Person(String name)
	{
		this.name = name;

	}// end constructor

	// constructor 3
	public Person(String name, int age, boolean isHealthy)
	{
		this.name = name;
		this.age = age;
		this.isHealthy = isHealthy;

	}// end constructor

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// toString method gives the string represenataion of the object
	public String toString()
	{

		return "Hello my name is " + this.name;

	}// end toString

}// end class
