package com.eric.objects;

public class ContactDetails
{
	private String name;
	private String number;
	private char gender;
	private int age;

	public ContactDetails(String newName, String newNumber, char newGender, int newAge)
	{
		name = newName;
		number = newNumber;
		gender = newGender;
		age = newAge;
	}// end CDConstructor

	// methods
	public String getName()
	{
		return name;
	}

	public String getNumber()
	{
		return number;
	}

	public char getGender()
	{
		return gender;
	}

	public int getAge()
	{
		return age;
	}

}
