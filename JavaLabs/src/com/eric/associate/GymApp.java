package com.eric.associate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class GymApp
{
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<GymMembership> members = new ArrayList<GymMembership>();

	public static void main(String[] args)
	{
		boolean isRunning = true;
		while (isRunning)
		{
			System.out.println("\nWelcome to the Gym.");
			System.out.println("[1]Join the gym\n[2]Display all members\n[3]Exit\n[4]Pay for another Year\nUSER");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
			{
				// create member and membership and add to arraylist
				joinGym();
			}
				break;
			case 2:
			{
				// print out arrayList
				printMembers();

			}
				break;
			case 3:
			{
				System.out.println("Exiting App");
				isRunning = false;
			}
				break;
			case 4:
			{
				// pay for an additional year
				System.out.println("Please enter your Membership ID: ");
				int id = scan.nextInt();
				for (GymMembership g : members)
				{
					if (id == g.getNum())
					{

						// fetch the index of that number from the list
						// and update the membership
						members.get(id).payMembership();
						System.out.println("Membership update. paid until " + members.get(id).getExpire());

					} // end if
				} // end for

			} // end case 4
				break;

			default:
			{
				System.out.println("not a valid option");
			}
			}// end switch
		} // end while
	}// end main

	// joinGym
	public static void joinGym()
	{
		DateHolder dateArray[] = new DateHolder[2];
		// create person
		Person p1 = getDetails();
		dateArray = getDate();

		// create a membership
		GymMembership m1 = new GymMembership(p1, dateArray[0], dateArray[1]);
		members.add(m1);

	}// end joinGym

	public static Person getDetails()
	{
		// get details from user
		System.out.println("first:");
		String first = scan.next();
		System.out.println("second:");
		String second = scan.next();
		System.out.println("dd:");
		String dd = scan.next();
		System.out.println("mm:");
		String mm = scan.next();
		System.out.println("yy:");
		String yy = scan.next();
		DOB dob1 = new DOB(dd, mm, yy);

		Person p1 = new Person(first, second, dob1);
		return p1;

	}// end getDetails

	public static DateHolder[] getDate()
	{
		DateHolder dateArray[] = new DateHolder[2];
		String day = String.format("%td", Calendar.getInstance());
		String month = String.format("%tm", Calendar.getInstance());
		String year = String.format("%ty", Calendar.getInstance());
		// for the sake of the constructor
		int y = Integer.parseInt(year);

		String year1 = String.format("%ty", Calendar.getInstance());
		int year2 = Integer.parseInt(year1);

		year2++;

		// String expYear = String.format("", year2);

		DateHolder start = new DateHolder(day, month, y);
		DateHolder expire = new DateHolder(day, month, year2);

		dateArray[0] = start;
		dateArray[1] = expire;

		return dateArray;

	}// end getdate

	public static void printMembers()
	{
		for (GymMembership g : members)
			System.out.println(g);
	}

}// end class
