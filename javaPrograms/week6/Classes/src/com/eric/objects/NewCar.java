package com.eric.objects;

public class NewCar
{
	private String make;
	private String model;

	public NewCar(String newMake, String newModel)
	{
		make = newMake;
		model = newModel;

	}

	public String toString()
	{
		return "Make: " + make + "\nModel : " + model;
	}
}// end newCar
