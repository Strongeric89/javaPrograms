package com.eric;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExercise
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("The Classroom Simulation:\n--------------------------\n");
		ArrayList<String> list = new ArrayList<String>();
		boolean isNotFull = true;
		System.out.println("Please enter your name:(when room is full enter \"Full\")");
		String name;
		int i = 0;
		boolean hasLeft = true;
		do
		{

			name = scan.nextLine();
			if(name.equalsIgnoreCase("full"))
			{
				System.out.println("Class room full!");
				isNotFull = false;
				break;
			} // end if
			list.add(name);
			System.out.println(name + "\t entered to index " + i);
			i++;

		} // end do
		while (isNotFull);
		// getting size of the list
		System.out.println("Printing list of People:");
		System.out.println(list);

		// now to remove people from the list
		System.out.println("Who has left the room?: (enter end to stop the check)");
		do
		{
			name = scan.nextLine();
			if(name.equalsIgnoreCase("end"))
			{
				hasLeft = false;
				break;
			} // end if
			list.remove(name);

		} // end do
		while (hasLeft);
		System.out.println("Printing who is remains in the room");
		System.out.println(list);

		System.out.println("who has re-entered the room? (enter end to stop the list)");
		boolean hasEntered = true;

		// adding people back
		do
		{
			name = scan.nextLine();
			if(name.equalsIgnoreCase("end"))
			{
				hasLeft = false;
				break;
			} // end if
			list.add(name);

		} // end do
		while (hasEntered);
		int size = list.size();
		System.out.println("College is over. everyone has left.");
		list.removeAll(list);
		System.out.println(size + "people left in the room:");
		System.out.println(list);

	}// end main
}// end class
