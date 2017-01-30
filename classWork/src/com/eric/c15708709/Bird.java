package com.eric.c15708709;

public class Bird extends Animal implements Flyable
{
	public Bird()
	{

	}

	public Bird(String type, int age, String name)
	{
		super(type, age, name);
		// TODO Auto-generated constructor stub
	}

	public void fly()
	{
		System.out.println(super.getName() + " is flying");

	}

	public void move()
	{
		System.out.println(super.getName() + " is flapping wings");
	}

}
