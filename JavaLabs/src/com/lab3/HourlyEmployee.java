/**
 * @author Eric
 * Date: 15 Dec 2016
 * Lab: 3 - employee, hourlyemployee
 */

package com.lab3;

public class HourlyEmployee extends Employee
{
	// extra attributes
	private double hoursWorked = 0.00;
	private double hourlyRate = 0.00;

	public HourlyEmployee(String first, String second, int staff, double sal, String start, double hours, double rate)
	{
		super(first, second, staff, sal, start);

		this.hourlyRate = rate;
		this.hoursWorked = hours;

	}// end constructor

	public double calculatePay()
	{
		// pay = hour * rate
		double total = 0.00;
		total = this.hoursWorked * this.hourlyRate;
		return total;
	}

	public String toString()
	{
		return "\n\nName:" + getFirstName() + " " + getLastName() + "\nEmployee Number:" + getStaffNumber()
				+ "\nHourly Rate:" + this.hourlyRate + "\nStart Date:" + getStartDate();
	}

}