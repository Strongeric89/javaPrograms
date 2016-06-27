package com.eric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListsExercise2
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the School Registration Sytem.\n------------------------------------ ");

		Scanner scan = new Scanner(System.in);

		ArrayList<String> list = new ArrayList<String>();
		boolean isRunning = true;
		boolean isAdding = true;
		String name;

		System.out.println("Please enter your name:(enter \"end\" to Quit)");
		do
		{

			name = scan.nextLine();
			if(name.equalsIgnoreCase("end"))
			{
				System.out.println("All students entered.");
				isRunning = false;
				break;
			} // end if
			list.add(name);

		} // end do
		while (isRunning);
		int size = list.size();

		isRunning = true;
		while (isRunning)
		{
			System.out.println("Please pick an option:\n[1]Sort names\n"
					+ "[2]Display and Count\n[3]Remove name or Index\n[4]Add more Students\n[5]Exit");

			int option = scan.nextInt();

			switch(option)
			{
				case 1 :
				{
					Collections.sort(list);
					// System.out.println(list);

				} // end case 1
					break;

				case 2 :
				{
					System.out.println("the number of students in the list is " + size);
					System.out.println(list);

				} // end case 2
					break;

				case 3 :
				{
					System.out.println("Who do you want to remove from the list? ");
					name = scan.next();
					list.remove(name);
				}
					break;

				case 4 :
				{
					System.out.println("enter 1 to quit.");
					System.out.println("adding more Student(s)\n-----------------------");
					do
					{
						name = scan.next();
						if(name.equalsIgnoreCase("1"))
						{
							isAdding = false;
							System.out.println("Please pick an option:\n[1]Sort names\n"
									+ "[2]Display and Count\n[3]Remove name or Index\n[4]Add more Students\n[5]Exit");
							break;
						} // end if
						list.add(name);
						System.out.println(name + " added to list");

					} // end do
					while (isAdding);
					isAdding = true;

				} // end case 4
					break;

				case 5 :
				{
					isRunning = false;
				}
					break;

				default:
				{
					System.out.println("Not a valid option");
				}
			}// end switch
		} // end while
		int arSize = list.size();
		String names[] = new String[arSize];
		list.toArray(names);
		System.out.println("Converting to array\n-------------------");

		for(int i = 0; i < arSize; i++)
		{
			System.out.println((i + 1) + ".\t" + names[i]);
		} // end for

		System.out.println("Exit........");

	}// end main

}// end class
