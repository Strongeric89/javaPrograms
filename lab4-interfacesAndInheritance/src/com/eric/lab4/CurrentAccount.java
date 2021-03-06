package com.eric.lab4;

/**
 * @author Eric Strong Date: 15 Feb 2017 Lab: 4 - interfaces and inheritance ID:
 *         C15708709
 */
public class CurrentAccount extends Account implements ValidatedAccount
{

	// attributes
	private double penaltyAmount = 20.00;

	public CurrentAccount(String accountName, int accNumber, String sort, String branch, boolean inCred,
			double acctBalance)
	{
		// call to super class constructor
		super(accountName, accNumber, sort, branch, inCred, acctBalance);
		this.setAccountType("Current Account");

	}// end constructor

	public double getPenaltyAmount()
	{
		return penaltyAmount;
	}

	// getters and setters
	public void setPenaltyAmount(double penaltyAmount)
	{
		this.penaltyAmount = penaltyAmount;
	}

	// overridden withdraw method
	public void withdraw(double deposit)
	{

		double bal = this.getAcctBalance();
		bal -= deposit;
		if (bal < 0.00)
		{
			System.out.println("Insuffient Funds");
		} // end if
		else
		{
			super.withdraw(deposit);
		} // end else

	}// end withdraw

	// overloaded
	public String checkCredit()
	{
		String message = "";
		if (this.isInCredit() == true)
		{
			message += "The account " + this.getAccountNumber() + " is in credit";
		}

		else
		{
			message += "The account " + this.getAccountNumber() + " is NOT in credit";
		}

		return message;
	}// end checkCredit

	public String checkCredit(String warning)
	{

		if (this.getAcctBalance() < 100 && this.getAcctBalance() > 0)
		{
			return warning + "balance is below 100 but greater than 0";
		}
		return "--nothing--";
	}

	// toString
	public String toString()
	{
		return super.toString() + "\nPenalty amount: �" + this.getPenaltyAmount();
	}
}// end currentAccount
