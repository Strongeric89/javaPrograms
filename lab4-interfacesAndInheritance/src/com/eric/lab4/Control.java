package com.eric.lab4;

/**
 * @author Eric Strong Date: 15 Feb 2017 Lab: 4 - interfaces and inheritance ID:
 *         C15708709
 */
public class Control
{

	public static void main(String[] args)
	{
		/*
		 * PART 1
		 * 
		 */
		// for the constructor
		// String accountName, int accNumber, String sort, String branch,
		// boolean inCred, double acctBalance

		// instantiate each type
		Account a1 = new Account("Eric Strong", 7512, "970105", "Balbriggan. Co Dublin", true, 150.57);
		a1.deposit(50);
		a1.withdraw(90);

		// System.out.println(a1);

		DepositAccount da1 = new DepositAccount("Ger Strong", 6798, "9701077", "Drogheda. Co Louth", true, 1150.59,
				21.5);
		da1.deposit(30.5);
		da1.withdraw(50);
		// System.out.println(da1);

		CurrentAccount ca1 = new CurrentAccount("Laura Bermingham", 5577, "550102", "Palmerstown. Co Dublin", true,
				99.00);

		ca1.withdraw(9.00);
		System.out.println(ca1.checkCredit());

		/*
		 * 
		 * PART 2 - when adding final to the withdraw method by adding final to
		 * the there is a compiler error. This is due to the fact that when set
		 * to final it cannot be changed, thus meaning the deposit argument is
		 * unable to change the current state of the attribute. This error also
		 * has a ripple effect on both subclasses as this attribute has be
		 * inherited by the super class
		 * 
		 * -when add final to the class by adding final to the class this means
		 * then it cannot be inherited, or in other words "account" is at the
		 * bottom of the hierarchy, so anything else that tries to extend it, it
		 * will not allow this to happen. ie cannot subclass a final class. The
		 * effect is that anything that extends the final class will not be
		 * allowed to be inherited.
		 * 
		 */

		/*
		 * PART 3 - Interfaces
		 * 
		 */
		System.out.println("part 3");
		a1.getDetails();
		ca1.getDetails();
		da1.getDetails();
		a1.valuableAccount();
		ca1.valuableAccount();
		da1.valuableAccount();

		/*
		 * PART 4 - using "Static"
		 * 
		 * 
		 */

		System.out.println(a1);
		System.out.println(da1);
		System.out.println(ca1);

		// TEST CODE HERE FOR DEMONSTRATION.........

	}// end main

}// end class
