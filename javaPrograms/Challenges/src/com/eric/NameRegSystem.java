/*
 * Team Jeric - eric and jason
 */
package com.eric;

import java.util.Arrays;
import java.util.Scanner;

public class NameRegSystem
{
	public static void main(String[] args)
	{
		String cls = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

		// Declaring our Scanner
		Scanner scan = new Scanner(System.in);

		// Get the user to input information
		System.out.println(
				"Welcome to name registry system\n--------------------------------\nEnter how many names you want added to the list:");
		int size = scan.nextInt();

		boolean isRunning = true;
		String[] names = new String[size];

		System.out.println("Please enter " + size + " name(s) into the list:");
		// input the names into the array
		for(int j = 0; j < names.length; j++)
		{
			System.out.print((j + 1) + ".\t");
			names[j] = scan.next();
		} // end for

		System.out.println("System updated.");

		do
		{

			System.out.println(
					"-----------------------------------\n[1] View the names that are registered\n[2] Edit one of the names on the list by choosing which one to change\n[3] Exit the program\n");
			int userOption = scan.nextInt();

			switch(userOption)
			{
				case 1 :
				{
					int i = 1;
					System.out.println("would you like to sort the list alphabetically?[Y/N]");
					char alpha = scan.next(".").charAt(0);
					if(alpha == 'y' || alpha == 'Y')
					{
						Arrays.sort(names);
						for(String elements : names)
						{
							System.out.println(i + ".\t" + elements);
							i++;
						} // end for
					} // end if
					else
					{

						System.out.println("the names in the list are:");
						for(String elements : names)
						{
							System.out.println(i + ".\t" + elements);
							i++;
						} // end for
					} // end else

				}
					break;// end case 1

				case 2 :
				{
					System.out.println("what name do you want to edit? (#number 1-" + size + ")");
					int change = scan.nextInt();
					System.out.println("Enter the new name:");
					String newName = scan.next();
					names[change - 1] = newName;
					System.out.println("UPDATED.....");
				}
					break;// end case 2

				case 3 :
				{
					// exit point from the program
					System.out.println("are you sure you want to exit?[Y/N]");
					char exit = scan.next(".").charAt(0);
					if(exit == 'y' || exit == 'Y')
					{
						System.out.println("exiting program....");
						isRunning = false;
					} // end if
					else
					{
						System.out.println("Continue.....");
					}
				}
					break;// end case 3

				default:
				{
					System.out.println("invalid option. Try again!.");
				}
					break;// end default

			}// end switch

		} // end do
		while (isRunning);

	}// end main
}// end class
