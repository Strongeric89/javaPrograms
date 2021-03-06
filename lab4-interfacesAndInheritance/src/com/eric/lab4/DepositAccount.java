package com.eric.lab4;

/**
 * @author Eric Strong Date: 15 Feb 2017 Lab: 4 - interfaces and inheritance ID:
 *         C15708709
 */
public class DepositAccount extends Account implements ValidatedAccount
{

	// attributes
	private double interestRate;

	public DepositAccount(String accountName, int accNumber, String sort, String branch, boolean inCred,
			double acctBalance, double interestRate)
	{
		// call to the super class constructor
		super(accountName, accNumber, sort, branch, inCred, acctBalance);

		this.interestRate = interestRate;
		this.setAccountType("Deposit Account");

	}// end constructor

	// overridden method withdraw
	public void withdraw(double deposit)
	{
		System.out.println("\nYou cannot withdraw from a deposit account.");

	}// end withdraw

	public double getInterestRate()
	{
		return interestRate;
	}

	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}

	// toString
	public String toString()
	{
		return super.toString() + "\nInterest Rate: " + this.getInterestRate() + " %";
	}

}// end class
