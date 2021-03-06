package com.lab3;

/**
 * @author Eric Strong Date: 8 Feb 2017 Lab: ID: C15708709
 */
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
		return super.toString() + "\nCommission Earned:�" + this.commissionEarned;
		// return "\n\nName:" + getFirstName() + " " + getLastName() +
		// "\nEmployee Number:" + getStaffNumber()
		// + "\nCommission Earned:�" + this.commissionEarned + "\nStart Date:" +
		// getStartDate();
	}

}
