package com.eric.lab4;

/**
 * @author Eric Strong Date: 15 Feb 2017 Lab: 4 - interfaces and inheritance ID:
 *         C15708709
 */
public class Account implements ValidatedAccount
{
	// attributes
	private String accountName;
	private int accountNumber = 0;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double acctBalance;

	// for part 3
	private String accountType;

	// for part 4
	private static int number = 1;

	// constructor
	public Account(String accountName, int accNumber, String sort, String branch, boolean inCred, double acctBalance)
	{
		this.accountName = accountName;
		this.accountNumber = number; // adding the number then its incremented
		this.sortCode = sort;
		this.branchName = branch;
		this.inCredit = inCred;
		this.acctBalance = acctBalance;
		this.accountType = "Account";

		// for part 4 increment the static variable
		number++;

		System.out.println(accountNumber + ". Account Created for " + this.getAccountName());

	}// end constructor

	// methods
	public void deposit(double deposited)
	{

		this.acctBalance += deposited;
		System.out.println("You have deposited �" + deposited + " \nYour new balance is �" + this.acctBalance);

	}// end deposit

	public void withdraw(double deposit)
	{

		this.acctBalance -= deposit;
		// check if you are in credit
		System.out.println("You have withdrawn �" + deposit + " \nYour new balance is �" + this.acctBalance);

		if (this.acctBalance <= 0)
		{
			// set incredit to false
			this.setInCredit(false);

		}

	}// end withdraw

	// getters and setters
	public String getAccountName()
	{
		return accountName;
	}

	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public String getSortCode()
	{
		return sortCode;
	}

	public void setSortCode(String sortCode)
	{
		this.sortCode = sortCode;
	}

	public String getBranchName()
	{
		return branchName;
	}

	public void setBranchName(String branchName)
	{
		this.branchName = branchName;
	}

	public boolean isInCredit()
	{
		return inCredit;
	}

	public void setInCredit(boolean inCredit)
	{
		this.inCredit = inCredit;
	}

	public double getAcctBalance()
	{
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance)
	{
		this.acctBalance = acctBalance;
	}

	public String getAccountType()
	{
		return accountType;
	}

	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}

	// toString method
	public String toString()
	{
		// accountName, accNumber, sort,branch, inCred, acctBalance
		return "\nAccount Name: " + this.getAccountName() + "\nAccount Number: " + this.getAccountNumber()
				+ "\nSort Code:" + this.getSortCode() + "\nBranch: " + this.getBranchName() + "\nIn Credit?: "
				+ this.isInCredit() + "\nBalance: �" + this.getAcctBalance();
	}

	@Override
	public void getDetails()
	{

		System.out.println("\nAccount Type: " + this.getAccountType() + "\nAccount Balance: �" + this.getAcctBalance()
				+ "\nAccount Name: " + this.getAccountName());

	}

	@Override
	public void valuableAccount()
	{
		System.out.println("The account Balance is �" + this.getAcctBalance());

	}

}// end class
