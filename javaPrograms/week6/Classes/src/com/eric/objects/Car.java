package com.eric.objects;

public class Car
{
	private String make;
	private String model;
	private int year;
	private char transmission;
	private double price;
	private boolean print;

	public Car(boolean newPrint, String newMake, String newModel, int newYear, char newtrans, double newprice)
	{
		print = newPrint;
		make = newMake;
		model = newModel;
		year = newYear;
		transmission = newtrans;
		price = newprice;

		if(newPrint == true)
		{
			System.out.println(make + model + year + transmission + price);
		}

	}// end construct

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public int getYear()
	{
		return year;
	}

	public char getTransmission()
	{
		return transmission;
	}

	public double getPrice()
	{
		return price;
	}

}
