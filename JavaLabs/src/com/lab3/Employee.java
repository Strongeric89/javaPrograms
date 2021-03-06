
package com.lab3;

/**
 * @author Eric Strong Date: 8 Feb 2017 Lab 3: ID: C15708709
 */
public class Employee
{
	// attributes
	private String firstName;
	private String lastName;
	private int staffNumber;
	private double baseAnnualSalary = 0.00;
	private String startDate;

	// constructor
	public Employee(String first, String second, int staff, double sal, String start)
	{
		this.firstName = first;
		this.lastName = second;
		this.staffNumber = staff;
		this.baseAnnualSalary = sal;
		this.startDate = start;

		System.out.printf("%s %s is now on the System.", this.firstName, this.lastName);

	}// end Employee Constructor

	public double calculatePay()
	{
		// pay = bAs / 12
		double total = 0.00;
		total = this.baseAnnualSalary / 12;
		return total;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
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

	public String toString()
	{
		String reference = "\n\nName:" + this.firstName + " " + this.lastName + "\nEmployee Number:" + this.staffNumber
				+ "\nStart Date:" + this.startDate;

		if (this.baseAnnualSalary > 0.00)
		{

			reference += "\nSalary:�" + this.baseAnnualSalary;
		}

		return reference;
	}

}// end class
