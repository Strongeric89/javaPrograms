package com.eric.associate;

public class Planet
{
	private String name;
	private String info;
	private float size = 0.00f;

	// constructor
	public Planet(String name, float size, String info)
	{
		this.name = name;
		this.info = info;
		this.size = size;
		System.out.println("Planet " + this.name + " created");
	}// end constructor

	public String toString()
	{
		return "\nplanet:" + this.name + "\nsize:" + this.size + "\ninfo:" + this.info;
	}// end toString

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getInfo()
	{
		return info;
	}

	public void setInfo(String info)
	{
		this.info = info;
	}

	public float getSize()
	{
		return size;
	}

	public void setSize(float size)
	{
		this.size = size;
	}

}// end class
