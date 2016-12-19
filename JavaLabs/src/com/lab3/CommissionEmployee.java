/**
 * @author Eric Date: 15 Dec 2016 Lab: 3 - employee lab
 */
package com.lab3;

public class CommissionEmployee extends Employee
{
	private double commissionEarned = 0.00;

	public CommissionEmployee(String first, String second, int staff, double sal, String start, double com)
	{
		super(first, second, staff, sal, start);
		this.commissionEarned = com;

	}// end constructor

	public double calculatePay()
	{
		// pay = bas / 12 + commish
		double total = 0.00;
		total = (getBaseAnnualSalary() / 12) + this.commissionEarned;
		return total;
	}

	public String toString()
	{
		return "\n\nName:" + getFirstName() + " " + getLastName() + "\nEmployee Number:" + getStaffNumber()
				+ "\nCommission Earned:" + this.commissionEarned + "\nStart Date:" + getStartDate();
	}

}
