package com.lab3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Strong Date: 8 Feb 2017 Lab:3 ID: C15708709
 */
public class Control
{
	public static void main(String[] args)
	{
		// // String first, String second, int staff, double sal, String start)
		// Employee eric = new Employee("Eric", "Strong", 1, 2500.00,
		// "January2008");
		// System.out.println(eric);
		//
		// HourlyEmployee laura = new HourlyEmployee("Laura", "Bermingham", 2,
		// 0.00, "February 2010", 12, 10);
		// System.out.println(laura);
		//
		// CommissionEmployee ger = new CommissionEmployee("Gerard", "Strong",
		// 3, 35000, "October 2012", 10000);
		// System.out.println(ger);

		// part 3
		Scanner scan = new Scanner(System.in);
		int size = 3;
		Employee[] myEmployees = new Employee[size];
		// get information for size n employees

		for (int i = 0; i < myEmployees.length; i++)
		{
			System.out.println("\nWelcome to the Employee Register System.");
			System.out.println("\nEnter Employees first Name:");
			String name = scan.next();
			System.out.println("\nEnter Employees Second Name:");
			String surname = scan.next();
			// give employee a random number
			Random r = new Random();
			int num = r.nextInt(100);

			System.out.println("\nEnter Employees Starting Date:(DD/MM/YYYY)");
			String start = scan.next();

			// let user choose what employee

			while (i < myEmployees.length)
			{
				System.out.println("[1]Employee\n[2]Hourly Employee\n[3]Commission Employee\nUSER:");
				int option = scan.nextInt();

				switch (option)
				{
				case 1:
				{
					System.out.println("Enter Employee's Salary:");
					double sal = scan.nextDouble();

					// Create Object
					Employee emp = new Employee(name, surname, num, sal, start);
					myEmployees[i] = emp;

				}
					break;
				case 2:
				{
					System.out.println("Enter Employee's Hours:");
					double hours = scan.nextDouble();

					System.out.println("Enter Employee's Hourly Rate:");
					double rate = scan.nextDouble();

					// Create Object
					Employee emp = new HourlyEmployee(name, surname, num, 0.00, start, hours, rate);
					myEmployees[i] = emp;
				}
					break;

				case 3:
				{
					System.out.println("Enter Employee's Salary:");
					double sal = scan.nextDouble();
					System.out.println("Enter Employee's Commision Earned:");
					double com = scan.nextDouble();
					Employee emp = new CommissionEmployee(name, surname, num, sal, start, com);
					myEmployees[i] = emp;

				}
					break;

				default:
				{
					System.out.println("Not a valid option. try again");
				}

				}// end switch
				break;
			} // end while

		} // end for

		// print out all employees and getsalaries
		for (int i = 0; i < myEmployees.length; i++)
		{
			System.out.println(myEmployees[i]);
			System.out.printf("Pay total is �%.2f", myEmployees[i].calculatePay());
		} // end for

	}// end main

}// end class
