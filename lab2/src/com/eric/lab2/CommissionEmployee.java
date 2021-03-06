package com.eric.lab2;

/**
 * @author Eric Strong Date: 8 Feb 2017 Lab: ID: C15708709
 */
public class CommissionEmployee extends Employee
{
	private double commissionEarned;

	public CommissionEmployee(String firstName, String surName, int staffNumber, double baseAnnualSalary,
			String startDate, double commissionEarned)
	{
		super(firstName, surName, staffNumber, baseAnnualSalary, startDate);
		this.commissionEarned = commissionEarned;

	}// end constructor

	// calculatePay
	public double calculatePay()
	{
		// pay = baseannualsalary divided by 12, plus the commissionEarned
		double pay = (super.getBaseAnnualSalary() / 12) + this.commissionEarned;
		return pay;

	}// end calculatePay

	public double getCommissionEarned()
	{
		return commissionEarned;
	}

	public void setCommissionEarned(double commissionEarned)
	{
		this.commissionEarned = commissionEarned;
	}

	// getters and setters

}// end CommissionEmployee
