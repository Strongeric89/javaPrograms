package com.eric.associate;

import java.util.Scanner;

public class Converter
{
	public static Scanner scan = new Scanner(System.in);
	// variables for the currency converter. change these here
	public static float euro = .90f;
	public static float usDollar = 1.10f;
	public static float caDollar = 1.20f;
	public static float yen = 1.05f;
	public static float gbPound = 1.26f;
	public static float ausDollar = .96f;

	// for shoe size
	public static double uS[] =
	{ 4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10, 10.5, 11, 11.5, 12 };
	public static String eU[] =
	{ "35", "35-36", "36", "36-37", "37", "37-38", "38", "38-39", "39", "39-40", "40", "40-41", "41", "41-42", "42",
			"42-43" };
	public static double uK[] =
	{ 2, 2.5, 3, 3.5, 4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10 };

	public static void main(String[] args)
	{
		// menu
		System.out.println("Welcome to the World Converter App");
		boolean isRunning = true;
		while (isRunning)
		{
			System.out.println(
					"[1]Currency Converter\n[2]Temperature Converter\n[3]Weight Converter\n[4]Distance Converter\n[5]Shoe Size Converter\n[6]Exit\nUSER:");
			int option = scan.nextInt();

			switch (option)
			{
			case 1:
			{
				System.out.println("You picked Currency Converter");
				currency();

			}
				break;
			case 2:
			{
				System.out.println("You picked Temperature Converter");
				temp();

			}
				break;
			case 3:
			{
				System.out.println("You picked Weight Converter");
				weight();

			}
				break;
			case 4:
			{
				System.out.println("You picked Distance Converter");
				distance();

			}
				break;

			case 5:
			{
				System.out.println("You picked Shoe Size Converter");
				shoe();

			}
				break;
			case 6:
			{
				System.out.println("Exiting Program");
				isRunning = false;

			}
				break;

			default:
			{
				System.out.println("Not a valid Option. Try again");
			}
			}// end switch

		} // end while

	}// end main

	// Functions for each option
	public static void currency()
	{
		boolean isRunning = true;
		while (isRunning)
		{
			System.out.println("\n[1]US Dollar\n[2]GB pound\n[3]Yen\n[4]CA dollar\n[5]AUS dollar\n[6]Exit\nUSER:");
			int option = scan.nextInt();

			switch (option)
			{
			case 1:
			{
				System.out.println("You picked US Dollar");
				float euroTous = euro * usDollar;
				System.out.printf("Euro %f - USDollar %f = %f ", euro, usDollar, euroTous);

			}
				break;
			case 2:
			{
				System.out.println("You picked GB Pound");
				float euroToGB = euro * gbPound;
				System.out.printf("Euro %f - gbPound %f = %f ", euro, gbPound, euroToGB);

			}
				break;
			case 3:
			{
				System.out.println("You picked Yen");
				float euroToyen = euro * yen;
				System.out.printf("Euro %f - yen %f = %f ", euro, yen, euroToyen);

			}
				break;
			case 4:
			{
				System.out.println("You picked CA dollar");
				float euroToca = euro * caDollar;
				System.out.printf("Euro %f - caDollar %f = %f ", euro, caDollar, euroToca);

			}
				break;

			case 5:
			{
				System.out.println("You picked AUS dollar");
				float euroToaus = euro * ausDollar;
				System.out.printf("Euro %f - ausDollar %f = %f ", euro, ausDollar, euroToaus);

			}
				break;
			case 6:
			{
				System.out.println("back to main menu");
				isRunning = false;

			}
				break;

			default:
			{
				System.out.println("Not a valid Option. Try again");
			}
				break;
			}// end switch

		} // end while

	}// end currency

	public static void temp()
	{

		/*
		 * F to C Deduct 32, then multiply by 5, then divide by 9 °C to °F c to
		 * F Multiply by 9, then divide by 5, then add 32
		 */
		boolean isRunning = true;
		while (isRunning)
		{

			System.out.println("\n[1]Farenheit to Celcius\n[2]Celcius to Farenheit\n[3]exit\nUSER:");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
			{
				// F to C Deduct 32, then multiply by 5, then divide by 9
				System.out.println("Farenheit to Celcius");

				System.out.println("enter Farenheit:");
				float far = scan.nextFloat();
				float answer = ((far - 32) * 5) / 9;
				System.out.printf("Farenheit %f to celcius = %f\n", far, answer);

			}
				break;

			case 2:
			{
				// c to F Multiply by 9, then divide by 5, then add 32
				System.out.println("enter celcius:");
				float cel = scan.nextFloat();

				float answer = ((cel * 9) / 5) + 32;
				System.out.printf("Celcius %f to farenheit = %f\n", cel, answer);

			}
				break;

			case 3:
			{
				System.out.println("returning to menu");
				isRunning = false;

			}
				break;

			default:
			{
				System.out.println("Not a valid option");
			}
				break;

			}// end switch
		} // end while

	}// end temp

	public static void weight()
	{
		// 1 pound (lb) is equal to 0.45359237 kilograms (kg).
		// 1 lb = 0.45359237 kg

		boolean isRunning = true;
		while (isRunning)
		{

			System.out.println("\n[1]lbs to kilo\n[2]kilo to lbs\n[3]exit\nUSER:");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
			{

				System.out.println("lbs to kilo");

				System.out.println("enter lbs:");
				double lbs = scan.nextDouble();
				double answer = lbs * 0.45359237;
				System.out.printf("lbs %f to kilo = %f\n", lbs, answer);

			}
				break;

			case 2:
			{
				System.out.println("kilo to lbs");

				System.out.println("enter kilo:");
				double kilo = scan.nextDouble();
				double answer = kilo / 0.45359237;
				System.out.printf("kilo %f to lbs = %f\n", kilo, answer);

			}
				break;

			case 3:
			{
				System.out.println("returning to menu");
				isRunning = false;

			}
				break;

			default:
			{
				System.out.println("Not a valid option");
			}
				break;

			}// end switch
		} // end while

	}// end weight

	public static void distance()
	{

		// km =mi / 0.62137

		boolean isRunning = true;
		while (isRunning)
		{

			System.out.println("\n[1]miles to kilometers\n[2]kilometers to miles\n[3]exit\nUSER:");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
			{

				System.out.println("miles to kilometers");

				System.out.println("enter miles:");
				double miles = scan.nextDouble();
				double answer = miles / 0.62137;
				System.out.printf("miles %f to kilometers = %f\n", miles, answer);

			}
				break;

			case 2:
			{
				System.out.println("kilometers to miles");

				System.out.println("enter km:");
				double km = scan.nextDouble();
				double answer = km * 0.62137;
				System.out.printf("kilometers %f to miles = %f\n", km, answer);

			}
				break;

			case 3:
			{
				System.out.println("returning to menu");
				isRunning = false;

			}
				break;

			default:
			{
				System.out.println("Not a valid option");
			}
				break;

			}// end switch
		} // end while

	}// end distance

	public static void shoe()
	{

		boolean isRunning = true;
		while (isRunning)
		{

			System.out.println("\n[1]EU to UK+US\n[2]US to UK+EU\n[3]UK to US+EU\n[4]exit\nUSER:");
			int option = scan.nextInt();
			switch (option)
			{
			case 1:
			{

				System.out.println("EU to UK+US:");

				System.out.println("enter EU size:");
				String eu = scan.next();
				int index = 0;
				// find the index for the size
				for (int i = 0; i < uK.length; i++)
				{
					if (eu.equals(eU[i]))
					{
						index = i;
						break;
					} // end if
				} // end for

				System.out.printf("EU size %s = UK:%f + US:%f\n", eU[index], uK[index], uS[index]);

			}
				break;

			case 2:
			{
				System.out.println("US to UK+EU:");

				System.out.println("enter US size:");
				double us = scan.nextDouble();
				int index = 0;
				// find the index for the size
				for (int i = 0; i < uK.length; i++)
				{
					if (us == uS[i])
					{
						index = i;
						break;
					} // end if
				} // end for

				System.out.printf("US size %f = UK:%f + EU:%s\n", uS[index], uK[index], eU[index]);

			}
				break;

			case 3:
			{
				System.out.println("UK to US+EU:");

				System.out.println("enter UK size:");
				double uk = scan.nextDouble();
				int index = 0;
				// find the index for the size
				for (int i = 0; i < uK.length; i++)
				{
					if (uk == uK[i])
					{
						index = i;
						break;
					} // end if
				} // end for

				System.out.printf("UK size %f = US:%f + EU:%s\n", uK[index], uS[index], eU[index]);

			}
				break;

			case 4:
			{
				System.out.println("returning to menu");
				isRunning = false;

			}
				break;

			default:
			{
				System.out.println("Not a valid option");
			}
				break;

			}// end switch
		} // end while

	}// end

}// end class
