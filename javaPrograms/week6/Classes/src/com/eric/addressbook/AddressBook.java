package com.eric.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
	public static ArrayList<Contact> book = new ArrayList<Contact>();

	public static void main(String[] args)
	{
		boolean isRunning = true;
		Scanner scan = new Scanner(System.in);
		do
		{
			System.out.println("Please select an option:\n-------------------------");
			System.out.println("[1]add contact\n[2]view Contacts\n[3]exit\n[4]Search for Contact");
			int userOption = scan.nextInt();
			switch(userOption)
			{

				case 1 :
				{
					// adding person to list
					System.out.println("you chose add a person to a list.");
					addPerson();
				}
					break;

				case 2 :
				{
					// print list
					System.out.println("you chose to print the list.");
					printList();
				}
					break;

				case 3 :
				{
					// exit the menu
					System.out.println("you chose to exit.");
					isRunning = false;

				}
					break;

				case 4 :
				{
					// Search the phone book
					System.out.println("you chose to Search.");

					search();

				}
					break;

				default:
				{
					System.out.println("you did not choose a valid option. Try again!");
				}
					break;
			}// end switch

		}
		while (isRunning);

	}// end main

	// addPerson option
	public static void addPerson()
	{
		Scanner scan = new Scanner(System.in);
		boolean isRunning = true;
		do
		{

			System.out.println("Phonebook App\n----------------------");

			System.out.print("Enter name:");
			String name = scan.next();

			if(name.equalsIgnoreCase("exit"))
			{
				isRunning = false;
				break;
			}

			System.out.print("Enter phone number:");
			String number = scan.next();

			System.out.print("Enter age:");
			int age = scan.nextInt();

			System.out.print("Enter Email:");
			String email = scan.next();

			Contact person = new Contact(name, number, age, email);

			book.add(person);

			System.out.println("(enter exit to quit entering)\n\n");

		} // enddo
		while (isRunning);
		System.out.println("back to menu.....");
	}// end addPerson

	public static void printList()
	{
		int index = 0;
		// printing the list
		for(Contact p : book)
		{
			System.out.println(++index + ". " + p);
		} // end for
	}// end printlist

	public static void search()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of person you are searching for:");
		String searchName = scan.nextLine();
		int flag = 0;

		int index = 0;
		for(Contact p : book)
		{
			if(searchName.equalsIgnoreCase(p.getName()))
			{
				System.out.println(book.get(index));
				flag = 1;
			}

			index++;
		} // end for
		if(flag == 0)
		{
			System.out.println(searchName + " is not in the phonebook");
		}
		// exiting the search reset the flag
		flag = 0;

	}// end search

}// end class
