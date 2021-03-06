package com.eric.lab5;

public class Date
{
	// attributes
	private int day;
	private int month;
	private int year;

	// constructor
	public Date(int day, int month, int year)
	{

		this.day = day;
		this.month = month;
		this.year = year;

		// System.out.println(this.day + "-" + this.month + "-" + this.year);

	}// end constructor

	public int getDay()
	{
		return day;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public String toString()
	{
		return this.day + "-" + this.month + "-" + this.year;
	}

}// end Date
