/*
 * the following program is to practice methods, returns and passing parameters and arrays
 */
package com.eric;

import java.util.Scanner;

public class arrayFor
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many famous people do you like?");
		int size = scan.nextInt();
		populateArray(size);

	}// end main

	public static void populateArray(int size)
	{
		Scanner scan = new Scanner(System.in);
		String famous[] = new String[size];
		System.out.println("Please enter " + size + " famous People:");

		for(int i = 0; i < size; i++)
		{
			famous[i] = scan.nextLine();
		} // end for

		String fav = printArray(famous);
		System.out.println("Your favourite person is " + fav);
	}// end populateArray

	public static String printArray(String[] names)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("You entered the following famous People:\n-----------------------------------------");

		// using the enhanced for loop
		for(String element : names)
		{
			System.out.print(element);
			element = "\t";
			System.out.print(element);

		}

		/*
		 * for(int i = 0; i < names.length; i++) { System.out.println((i + 1) +
		 * ".\t " + names[i]); } // end for
		 */

		System.out.println("Who is your favourite out of all?(number# 1-" + names.length + ")");
		int fav = scan.nextInt();
		String favPerson = names[fav - 1];
		return favPerson;

	}
}// end class
