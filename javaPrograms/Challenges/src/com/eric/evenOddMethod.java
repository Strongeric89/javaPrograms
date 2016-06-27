package com.eric;
import java.util.Scanner;
public class evenOddMethod {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int userNum = scan.nextInt();
		int check = oddEven(userNum);
		
		if(check == 0)
		{
			System.out.println("the number " + userNum + " is Odd!");
		}
		else if(check ==1)
		{
			System.out.println("the number " + userNum + " is Even!");
		}
	}//end main
	public static int oddEven(int num)
	{
		int check=1;
		System.out.println("The number you entered is " + num);
		
		if(num % 2 == 0)
		{
			check = 1;
		}//end if
		else if(num % 2 == 1)
		{
			check = 0;
		}//end else if
		return check;
	}//end oddEven
	
}//end class
