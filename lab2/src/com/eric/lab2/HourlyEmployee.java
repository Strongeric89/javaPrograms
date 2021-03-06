package com.eric.lab2;

/**
 * @author Eric Strong Date: 8 Feb 2017 Lab: ID: C15708709
 */
public class HourlyEmployee extends Employee
{
	private double baseAnnualSalary = 0.00;
	private double hoursWorked;
	private double hourlyRate;

	public HourlyEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate,
			double hoursWorked, double hourlyRate)
	{
		super(firstName, surName, staffNumber, baseAnnualSalary, startDate);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;

	}// end constructor

	// calculatePay OVERRIDEN method
	public double calculatePay()
	{
		// pay = hours worked multipled by the hourly rate
		double pay = this.hoursWorked * this.hourlyRate;
		return pay;

	}// end calculatePay

	public double getBaseAnnualSalary()
	{
		return baseAnnualSalary;
	}

	public void setBaseAnnualSalary(double baseAnnualSalary)
	{
		this.baseAnnualSalary = baseAnnualSalary;
	}

	public double getHoursWorked()
	{
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}

	// getters and setters for the remaining attributes

}// end HourlyEmployee
