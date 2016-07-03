package com.eric;

import java.util.Scanner;

public class XY
{
	public static void main(String[] args)
	{
		// call method to enter x and y
		char xPos = 'x';
		char yPos = 'y';
		boolean isRunning = true;
		int xposition1 = getPos(xPos, isRunning);
		int yposition1 = getPos(yPos, isRunning);

		int xposition2 = getPos(xPos, isRunning);
		int yposition2 = getPos(yPos, isRunning);
		isRunning = false;
		// get coOrdinates
		int xCo = getPos(xPos, isRunning);
		int yCo = getPos(yPos, isRunning);

		if(xCo > xposition1 && xCo < xposition2 && yCo < yposition1 && yCo > yposition2)
		{
			System.out.println("The Co-ordinates (" + xCo + "," + yCo + ") exists inside the rectangle (INSIDE)");
		} // end if
		else
		{
			System.out.println(
					"The Co-ordinates (" + xCo + "," + yCo + ") DOES NOT exists inside the rectangle (OUTSIDE)");
		}

	}// end main

	public static int getPos(char letter, boolean isRunning)
	{
		Scanner scan = new Scanner(System.in);
		if(isRunning == true)
		{
			System.out.println("Enter the position of " + letter);

		} // end if
		else
		{
			System.out.println("Enter the Co-Ordinates position to check for " + letter);
		} // end else

		int pos = scan.nextInt();
		return pos;
	}// endgetPos

}// end class
