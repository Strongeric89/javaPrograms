package com.eric.associate;

public class Person
{
	private String first;
	private String second;
	private DOB dob;

	public Person(String first, String second, DOB dob)
	{

		this.first = first;
		this.second = second;
		this.dob = dob;

	}

	public String toString()
	{
		return "Name:" + this.first + " " + this.second + "\n" + this.dob;
	}

	public String getFirst()
	{
		return first;
	}

	public void setFirst(String first)
	{
		this.first = first;
	}

	public String getSecond()
	{
		return second;
	}

	public void setSecond(String second)
	{
		this.second = second;
	}

	public DOB getDob()
	{
		return dob;
	}

	public void setDob(DOB dob)
	{
		this.dob = dob;
	}

}// end class
