package com.eric;
import java.util.Scanner;

public class methodQ2 {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a letter:");
		char letter = scan.next(".").charAt(0);
		System.out.println("How many times do you want the letter Printed?");
		int num = scan.nextInt();
		printLet(letter,num);
		
		
	}//end main
	public static void printLet(char letter, int num)
	{
		for(int i=0;i<num;i++)
		{
			System.out.print(letter);
		}
	}//end print
}
