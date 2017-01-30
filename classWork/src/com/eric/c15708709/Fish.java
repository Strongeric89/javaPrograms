package com.eric.c15708709;

public class Fish extends Animal implements Swimmable
{

	public Fish(String type, int age, String name)
	{
		super(type, age, name);
		// TODO Auto-generated constructor stub
	}

	public void swim()
	{
		// TODO Auto-generated method stub
		System.out.println(super.getName() + " is swimming");

	}

	@Override
	public void fishfloat()
	{
		// TODO Auto-generated method stub
		System.out.println(super.getName() + " is floating");

	}

	public void move()
	{
		if (super.getName().equalsIgnoreCase("nemo"))
		{
			System.out.println(super.getName() + " is flapping his one fin");
		} else
		{
			System.out.println(super.getName() + " is flapping fins...");
		}
	}

}
