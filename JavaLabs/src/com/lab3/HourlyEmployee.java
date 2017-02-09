
package com.lab3;

/**
 * @author Eric Strong Date: 8 Feb 2017 Lab:3 ID: C15708709
 */
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
		// returning the super toString and extra info
		return super.toString() + "\nHourly Rate:€" + this.hourlyRate;
		// return "\n\nName:" + getFirstName() + " " + getLastName() +
		// "\nEmployee Number:" + getStaffNumber()
		// + "\nHourly Rate:€" + this.hourlyRate + "\nStart Date:" +
		// getStartDate();
	}

}
