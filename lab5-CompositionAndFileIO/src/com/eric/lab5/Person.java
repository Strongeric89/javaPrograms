package com.eric.lab5;

public class Person
{
	private String firstName;
	private String surname;
	private Date dob;
	private char gender;

	public Person(String firstName, String surname, Date dob, char gender)
	{

		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
		this.gender = gender;

		System.out.println(this.firstName + " is entered into the system");

	}// end constructor

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getSurname()
	{
		return surname;
	}

	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public Date getDob()
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	public char getGender()
	{
		return gender;
	}

	public void setGender(char gender)
	{
		this.gender = gender;
	}

	public String toString()
	{
		return "\nFirst Name: " + this.firstName + "\nSurname: " + this.surname + "\nDate of Birth:" + this.dob
				+ "\nGender: " + this.gender;
	}

}// end person class
