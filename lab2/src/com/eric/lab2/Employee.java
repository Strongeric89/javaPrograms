package com.eric.lab2;

/**
 * @author Eric Strong Date: 8 Feb 2017 Lab: ID: C15708709
 */
public class Employee
{
	// The SUPER CLASS
	private String firstName;
	private String surName;
	private int staffNumber;
	private double baseAnnualSalary;
	private String startDate;

	// constructor
	public Employee(String firstName, String surName, int staffNumber, double baseAnnualSalary, String startDate)
	{
		this.firstName = firstName;
		this.surName = surName;
		this.staffNumber = staffNumber;
		this.baseAnnualSalary = baseAnnualSalary;
		this.startDate = startDate;

		System.out.println("Employee " + this.staffNumber + " Created.");

	}// end constructor

	// calculatePay method
	public double calculatePay()
	{
		double pay = this.baseAnnualSalary / 12;
		return pay;
	}// end calculatePay

	// getters and setters
	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getSurName()
	{
		return surName;
	}

	public void setSurName(String surName)
	{
		this.surName = surName;
	}

	public int getStaffNumber()
	{
		return staffNumber;
	}

	public void setStaffNumber(int staffNumber)
	{
		this.staffNumber = staffNumber;
	}

	public double getBaseAnnualSalary()
	{
		return baseAnnualSalary;
	}

	public void setBaseAnnualSalary(double baseAnnualSalary)
	{
		this.baseAnnualSalary = baseAnnualSalary;
	}

	public String getStartDate()
	{
		return startDate;
	}

	public void setStartDate(String startDate)
	{
		this.startDate = startDate;
	}

	// toString
	public String toString()
	{

		return "\nName:" + this.firstName + " " + this.surName + "\nStaff Number:" + this.staffNumber + "\nStart Date:"
				+ this.startDate + "\nPay: �" + this.calculatePay();

	}

}// end class
