package com.eric.lab1;

/**
 * @author Eric Date: 2 Feb 2017 Lab:1
 */
public class Vehicle
{
	private String ownerName;
	private String regNumber;
	private float mileage;
	private float maxSpeed;
	private String color;
	private boolean isAutomatic;
	private int numWheels;

	// constructor 1
	public Vehicle(String ownerName)
	{
		this.ownerName = ownerName;
	}

	// second constructor
	public Vehicle(String name, String regNumber, float mileage, float maxSpeed, String color, boolean isAutomatic,
			int numWheels)
	{
		// chaining the first constructor
		this(name);
		this.regNumber = regNumber;
		this.mileage = mileage;
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.isAutomatic = isAutomatic;
		this.numWheels = numWheels;
	}

	// PART 3 - toString()
	public String toString()
	{
		return "\nThe Vehicles owner name is " + this.ownerName + "\n The Reg number is " + this.regNumber
				+ "\n The Mileage is " + this.mileage + "\n The Maxspeed is " + this.maxSpeed + "\n The Color is "
				+ this.color + "\n is the vehicle automatic? " + this.isAutomatic + "\n The number of wheels is "
				+ this.numWheels;

	}// end toString

	public String getOwnerName()
	{
		return ownerName;
	}

	public void setOwnerName(String ownerName)
	{
		this.ownerName = ownerName;
	}

	public String getRegNumber()
	{
		return regNumber;
	}

	public void setRegNumber(String regNumber)
	{
		this.regNumber = regNumber;
	}

	public float getMileage()
	{
		return mileage;
	}

	public void setMileage(float mileage)
	{
		this.mileage = mileage;
	}

	public float getMaxSpeed()
	{
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public boolean isAutomatic()
	{
		return isAutomatic;
	}

	public void setAutomatic(boolean isAutomatic)
	{
		this.isAutomatic = isAutomatic;
	}

	public int getNumWheels()
	{
		return numWheels;
	}

	public void setNumWheels(int numWheels)
	{
		this.numWheels = numWheels;
	}

	// PART 5 - overloading
	public void resetMileage()
	{

		if (this.mileage > 20000.00)
		{
			this.mileage = 0f;
			System.out.println("Mileage reset for " + this.ownerName + "'s vehicle");
		}

	}// end resetMileage

	// overloaded version of resetMileage
	public void resetMileage(float increment)
	{
		this.mileage += increment;
		System.out.println("The mileage is now " + this.mileage);

	}// end resetMileage

}// end class
