/*
 * the following program will calculate a user specified number Factorial. 
 * implemented using Methods
 */
package com.eric;
import java.util.Scanner;

public class Factorial {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number:");
		int number = scan.nextInt();
		
		//calling the method
		int result = factorial(number);
		System.out.println("\nThe result of" + number + "factorial is: " + result);
	}//end main

	public static int factorial(int number)
	{
		int answer = 1;
		
		
		for(int i =number;i>0;i--)
		{
			System.out.print(i + " X ");
			 answer = answer * i;
		}//end for
		System.out.print(" = " + answer);
		return answer;
	}//end factorial
}//end class