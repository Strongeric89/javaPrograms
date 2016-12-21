package com.eric.associate;

import java.util.Scanner;

/**
 * @author Eric Date: 21 Dec 2016 Lab: CinemaApp seat selector
 */
public class CinemaApp
{
	public static Scanner scan = new Scanner(System.in);
	public static int rows = 7;
	public static int cols = 9;
	public static String map[][] = new String[rows][cols];
	public static String letters[] =
	{ " a", "b", "c", "d", "e", "f", "g", "h", "i" };

	public static void main(String[] args)
	{

		initializeMap(0, 0, 0);

		System.out.println("Welcome to cineworld.");
		System.out.println("[0] = vacant seat\n[#] = occupied seat\n\n");
		// for (String i : letters)
		// System.out.print(" " + i + " ");
		//
		// System.out.println("\n=========[Screen]===========");
		initializeMap(1, 0, 0);

		// select seat
		while (true)
		{
			seatPicker();
		}

	}// end main

	public static void initializeMap(int flag, int r, int c)
	{

		String empty = "[0]";
		String occupied = "[#]";
		printScreen();

		for (int i = 0; i < rows; i++)
		{
			if (flag != 0)
				System.out.print(i + 1);
			for (int j = 0; j < cols; j++)
			{

				if (flag == 0)
				{
					// set all seats to empty
					map[i][j] = empty;

				} else if (flag == 1)
				{

					System.out.print(map[i][j]);
				} else if (flag == 2)
				{

					if (i == r && j == c)
					{
						map[i][j] = occupied;
					}

					System.out.print(map[i][j]);

				}

			} // end inner
			System.out.println();
		} // end outter

	}// end initialize

	public static void seatPicker()
	{
		System.out.println("\nPlease pick your seat: {Row}{Col} eg... [3,b]");

		System.out.println("row: ");
		int r = scan.nextInt();
		r -= 1;

		System.out.println("Col: ");
		String c = scan.next();
		// get index of letter according to the String array
		int c1 = 0;
		for (int i = 0; i < letters.length; i++)
		{
			if (c.equals(letters[i]))
			{
				c1 = i;
			}
		}

		// now find the grid reference in the 2d array and change it to [#]
		initializeMap(2, r, c1);

	}// end seatPicker

	public static void printScreen()
	{
		for (String i : letters)
			System.out.print(" " + i + " ");

		System.out.println("\n=========[Screen]===========");
	}// end printScreen

}// end class
