package com.eric.addressbook;

public class Contact
{
	private String name;
	private String number;
	private int age;
	private String email;

	public Contact(String newName, String newNumber, int newAge, String newEmail)
	{
		name = newName;
		number = newNumber;
		age = newAge;
		email = newEmail;

	}// end constructor

	public String toString()
	{
		return "Name:" + name + "\tPhone:" + number + "\tAge: " + age + "\tEmail: " + email;
	}

	public String getName()
	{
		return name;
	}

}// end class
