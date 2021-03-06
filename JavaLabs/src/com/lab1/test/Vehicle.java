/*
 * Lab 1- part3 - Vehicle class
 * Author: Eric Strong
 * Date:
 */
package com.lab1.test;

public class Vehicle
{
	// Class attributes
	String owner = "someone";
	String reg = "00D0000";
	int maxSpeed = 0;
	String colour = "white";
	char transmission = 'A';
	int noOfWheels = 4;

	public Vehicle()
	{
		System.out.println("Default new car created.");
	}

	// constructor
	public Vehicle(String owner, String reg, int max, String colour, char tran, int wheels)
	{
		this.owner = owner;
		this.reg = reg;
		this.maxSpeed = max;
		this.colour = colour;
		this.transmission = tran;
		this.noOfWheels = wheels;

		System.out.println("new car created.");
	}// end of constructor

	public String toString()
	{
		return "Owner:" + this.owner + "\nReg:" + this.reg + "\nMax Speed:" + this.maxSpeed + "\nColour:" + this.colour
				+ "\nTransmission:" + this.transmission + "\nNo of Wheels:" + this.noOfWheels;
	}// end toString

}// end class
