package com.eric.associate;

/**
 * @author Eric Date: 20 Dec 2016 Lab: Banking app
 */
public class Account
{
	private static int num = -1;
	private String accountNumber;
	private Person accountHolderInfo;
	private float balance = 0.00f;
	private int pin = 1234;

	// constructor
	public Account(String acNumber, Person acInfo, int pin)
	{
		this.num++;
		this.accountNumber = acNumber;
		this.accountHolderInfo = acInfo;
		this.pin = pin;

		System.out.printf("Account %d Created.", num);
	}// end constructor

	// class methods
	public void withdraw(float amount)
	{
		this.balance = balance - amount;
		System.out.println("your balance is now:" + this.balance);

	}// end withdraw

	public void deposit(float amount)
	{
		this.balance = balance + amount;
		System.out.println("your balance is now:" + this.balance);

	}// end deposit

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}

	public String getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public float getBalance()
	{
		return balance;
	}

	public void setBalance(float balance)
	{
		this.balance = balance;
	}

	public int getPin()
	{
		return pin;
	}

	public void setPin(int pin)
	{
		this.pin = pin;
		System.out.println("pin update...");
	}

	public String toString()
	{
		return "" + this.accountHolderInfo + "\n" + this.accountNumber;
	}

}// end class
