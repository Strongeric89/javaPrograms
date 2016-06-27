package com.eric;

import java.util.Scanner;

public class commonChar
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ìnt var = 1;
		System.out.print("Please enter 3 characters:  ");

		char letters[] = new char[3];
		for(int i = 0; i < 3; i++)
		{
			letters[i] = scan.next(".").charAt(0);
		}

		char commonLet = common(letters);
		System.out.println("back in main.....Letter is " + commonLet);

	}// end main

	public static char common(char[] letters)
	{
		String letterCount[][] = new String[3][2];
		char temp;
		int count = 0;
		int max = 0;
		String common = "x";

		for(int i = 0; i < 3; i++)
		{
			temp = letters[i];
			letterCount[i][0] = Character.toString(temp);
			for(int j = 0; j < 3; j++)
			{
				if(temp == letters[j])
				{
					count++;
				} // end if

				if(count > max)
				{
					max = count;
					common = letterCount[i][0];
					break;
				}
				letterCount[i][1] = Integer.toString(count);

			} // end for
			count = 0;
		} // end for
		if(max == 1)
		{
			System.out.println("there is no common letter! Each only entered once");
		}
		else
		{
			System.out.println("the most common letter is " + common + " . The total count is " + max);
		}
		char first = common.charAt(0);

		return first;

	}// end common
}// end class
