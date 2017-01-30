package com.eric.c15708709;

/**
 * @author Eric Date: 30 Jan 2017 classwork: week1
 */
public abstract class Animal
{
	private String type;
	private int age;
	private String name;

	// overloading the constructor
	public Animal()
	{

	}// end default constructor

	public Animal(String type, int age, String name)
	{
		this.type = type;
		this.age = age;
		this.name = name;

	}

	public void run()
	{
		System.out.println(this.name + " is Running......");
	}

	public void sleep()
	{
		System.out.println(this.name + "is sleeping......");
	}

	public void move()
	{
		// TODO Auto-generated method stub
		System.out.println(this.name + "is moving");

	}

	public String toString()
	{
		return this.name + ", " + this.type + "," + this.age + "";
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}// end class
