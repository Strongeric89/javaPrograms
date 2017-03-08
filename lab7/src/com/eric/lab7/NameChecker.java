package com.eric.lab7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.eric.lab6.ReadApp;

/**
 * @author Eric Strong Date: 8 Mar 2017 Lab: 7 ID: C15708709
 */
public class NameChecker
{

	// create array List
	public static ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args)
	{
		// scanner to get name
		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter a name: ");
		String keyName = scan.next();

		// getnames
		getNames();

		// uncomment to read contents to prove file has been written over
		// for (String n : names)
		// {
		// System.out.println(n);
		// }

		// checknames
		int flag = checkNames(keyName);
		if (flag == 0)
		{
			System.out.println(keyName + " was not found in the file");
		}

		scan.close();

	}// end main

	public static void getNames()
	{
		// implement file reader and return names to the arraylist
		try
		{
			ReadApp file = new ReadApp("names.txt");
			file.readFile();

			names = file.getFileContents();

		} catch (IOException e)
		{
			System.out.println("file not found");

		}
	}// end GetNames

	public static int checkNames(String key)
	{
		int flag = 0;
		// logic to check each name in the array list
		for (String name : names)
		{
			if (name.equalsIgnoreCase(key))
			{

				System.out.println(key + " is a person's name in the file");
				flag = 1;
				break;
			} // end if
		} // end for
		return flag;

	}// end checkNames

}// end class
