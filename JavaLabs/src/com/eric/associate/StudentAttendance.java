package com.eric.associate;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class StudentAttendance
{
	public static Scanner scan = new Scanner(System.in);
	public static int student = 0;
	public static int day = 0;

	public static void main(String[] args)
	{
		boolean isRunning = true;
		while (isRunning)
		{
			JOptionPane.showMessageDialog(null, "Students in the Room: " + student, "Day:" + day,
					JOptionPane.INFORMATION_MESSAGE);
			isRunning = students();
			day++;

		} // endwhile
		JOptionPane.showMessageDialog(null, "all students left the course", "Day:" + day,
				JOptionPane.INFORMATION_MESSAGE);

	}// end main

	public static boolean students()
	{
		String value = "0";

		value = JOptionPane.showInputDialog(null, "how many students enter:", "student attendance",
				JOptionPane.INFORMATION_MESSAGE);
		if (value.equalsIgnoreCase("end"))
		{
			return false;
		}
		int i = Integer.parseInt(value);
		student += i;
		return true;

		// read in values

	}// end students

}// end class
