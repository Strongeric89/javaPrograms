package com.eric;
import java.util.Scanner;

public class FridayPart2 {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println("How many times do you want your name printed?");
		int number = scan.nextInt();
		for(int i=0;i<number;i++)
		{
			System.out.println((i + 1) + " : " + name);
		}
		
	}//end main

}
