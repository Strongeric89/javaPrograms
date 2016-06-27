package com.eric;

import java.util.Random;
import java.util.Scanner;

public class PhraseOMatic
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		String list1[] = { "24/7", "stop", "Run", "make", "happy", "Remember" };
		String list2[] = { "work", "amazing", "creation", "ensure", "briefly", "programming" };
		String list3[] = { "java", "python", "C", "C++", "HTML", "RobotC" };
		boolean isRunning = true;

		while (isRunning)
		{
			int randNum1 = r.nextInt(6);
			int randNum2 = r.nextInt(6);
			int randNum3 = r.nextInt(6);
			System.out.println(list1[randNum1] + " " + list2[randNum2] + " " + list3[randNum3]);
			scan.nextLine();

		} // end while
	}// end main

}// end class
