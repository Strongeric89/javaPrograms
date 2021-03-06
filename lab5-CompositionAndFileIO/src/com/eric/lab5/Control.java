package com.eric.lab5;

import java.util.Scanner;

/**
 * @author Eric Strong Date: 22 Feb 2017 Lab: 5 ID: C15708709
 */
public class Control
{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)
	{
		/*
		 * PART 1
		 */
		System.out.println("enter date for part 1:");
		Date date = getDetails();

		Job j1 = new Job(32500.50, "IT Intern", 5);
		System.out.println(j1);

		/*
		 * PART 2
		 */
		Person p = new Person("Eric", "Strong", date, 'M');
		System.out.println(p);

		// creating employee 1
		System.out.println("enter date for part 2:");
		Date date2 = getDetails();
		System.out.println("enter date for part 3:");
		Date date3 = getDetails();

		Job job2 = new Job(42000, "Java Developer", 7);
		Employee emp1 = new Employee("Laura", "Bermingham", date2, 'F', job2, 17, date3);
		System.out.println(emp1);

		// creating employee 2
		Job job3 = new Job(30000, "Python Developer", 7);
		Employee emp2 = new Employee("Eric", "Strong", date, 'M', job3, 18, date3);
		System.out.println(emp2);

		/**
		 * PART 3 - using a file to create to populate objects
		 * 
		 */

		job3.setupFile("roles.txt");
		job3.readfromfile();

		scan.close();
	}// end main

	public static Date getDetails()
	{

		int day = 0;
		int month = 0;
		int year = 0;

		System.out.println("Enter Day: (dd)");
		do
		{
			day = scan.nextInt();
			if (day >= 1 && day <= 31)
			{

				break;
			}
			System.out.println("Try again");

		} while (true);

		do
		{
			System.out.println("Enter Month: (mm)");
			month = scan.nextInt();
			if (month >= 1 && month <= 12)
			{

				break;
			}
			System.out.println("Try again");
		} while (true);

		do
		{
			System.out.println("Enter Year: (yyyy)");
			year = scan.nextInt();
			if (year >= 1900 && year <= 2017)
			{

				break;
			}
			System.out.println("Try again");
		} while (true);

		// create object
		Date date = new Date(day, month, year);
		return date;

	}// end getDetails
}// end control
