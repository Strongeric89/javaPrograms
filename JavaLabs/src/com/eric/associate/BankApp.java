package com.eric.associate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Eric Date: 20 Dec 2016 Lab: banking app
 */
public class BankApp
{
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Person> list = new ArrayList<Person>();
	public static ArrayList<Account> accountList = new ArrayList<Account>();
	public static int counter = 0;
	public static HashMap<String, Integer> dict = new HashMap<String, Integer>();

	public static void main(String[] args)
	{
		boolean isRunning = true;
		while (true)
		{

			while (isRunning)
			{
				System.out.println("Welcome to the Bank of Eric.");
				System.out.println("\n[1]Register your details\n[2]Set up Bank Account"
						+ "\n[3]Login to Bank Account\n[4]Exit\nUSER:");
				int option = scan.nextInt();

				switch (option)
				{
				case 1:
				{
					Person p1 = getDetails();
					list.add(counter, p1);

				}
					break;
				case 2:
				{
					Person p1 = list.get(counter);
					detailsForAccount(p1);
					System.out.println("\nYour Account number is: " + accountList.get(counter).getAccountNumber());
					dict.put(accountList.get(counter).getAccountNumber(), counter);
				}
					break;

				case 3:
				{
					System.out.println("Inserting card......");
					scan.next();
					// System.out.println(accountList.get(counter));

					System.out.println("Welcome to Bank link. Please enter your Account Number");
					String ac = scan.next();

					int num = dict.get(ac);

					if (ac.equals(accountList.get(num).getAccountNumber()))
					{
						System.out.println("Please enter your pin:");
						int pin = scan.nextInt();
						if (pin == accountList.get(num).getPin())
						{
							// enter a new switch case function here
							System.out.println("Welcome " + list.get(num).getFirst());
							// call interact with account
							interactWithAccount(num);

						} else
						{
							System.out.println("Incorrect pin");
						}
					} else
					{
						System.out.println("incorrect");
					}
				}
					break;

				case 4:
				{
					System.out.println("goodbye");
					// isRunning = false;
					counter++;
					break;

				}

				default:
				{
					System.out.println("not a valid option");
				}
					break;
				}// end switch

			} // end while

		}

	}// end main

	public static Person getDetails()
	{
		System.out.println("Please enter your first Name:");
		String first = scan.next();

		System.out.println("Please enter your Surname:");
		String second = scan.next();

		System.out.println("Please enter your DOB:");
		System.out.print("Day: ");
		String day = scan.next();
		System.out.print("Month: ");
		String month = scan.next();
		System.out.print("Year: ");
		String year = scan.next();
		// create DOB object
		DOB dob = new DOB(day, month, year);

		// create new Person
		Person p1 = new Person(first, second, dob);

		return p1;

	}// end getDetails

	public static void detailsForAccount(Person p1)
	{
		// generate random number for account
		Random r = new Random();

		// get a 5digit acc number
		String number = "A";
		int randInt = 0;
		randInt += counter;
		while (number.length() != 6)
		{
			randInt = r.nextInt(10);
			number = number + randInt;
		} // endwhile

		System.out.println("Set a pin:");
		int pin = scan.nextInt();

		// create a bank account
		Account p1Account = new Account(number, p1, pin);
		accountList.add(p1Account);

	}

	public static void interactWithAccount(int index)
	{
		boolean isRunning = true;
		while (isRunning)
		{
			System.out.println(
					"[1]check balance\n[2]withdraw\n[3]deposit\n[4]change pin\n[5]Change Personal details\n[6]exit\nUSER:");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
			{
				System.out.println("checking balance:");
				System.out.println(accountList.get(index).getBalance());
			}
				break;

			case 2:
			{
				System.out.println("enter amount to withdraw: ");
				float amount = scan.nextFloat();
				if (accountList.get(index).getBalance() < 0)
				{
					System.out.println("insuffient funds");
				} // end if
				else
				{
					accountList.get(index).withdraw(amount);
				} // end else
			} // end case
				break;

			case 3:
			{
				System.out.println("enter amount to deposit: ");
				float amount = scan.nextFloat();

				accountList.get(index).deposit(amount);

			} // end case
				break;

			case 4:
			{
				System.out.println("enter new pin:");
				int newPin = scan.nextInt();
				accountList.get(index).setPin(newPin);

			}
				break;

			case 5:
			{
				System.out.println("Updating personal details:");
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

				// setters
				list.get(index).setFirst(first);
				list.get(index).setSecond(second);
				list.get(index).setDob(dob1);

				System.out.println("Details Updated.");
				System.out.println(list.get(index));

			}
				break;

			case 6:
			{
				System.out.println("exiting. dont forget your card");
				isRunning = false;

			}
				break;
			default:
			{
				System.out.println("not a valid option");
			}
				break;

			}// end switch
		} // end while
		isRunning = true;
	}// end interactwithAccount

}// end class
