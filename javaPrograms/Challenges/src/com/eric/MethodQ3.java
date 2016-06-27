package com.eric;
import java.util.Scanner;

public class MethodQ3 {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter 3 numbers:");
		int num1,num2,num3;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		//calling method
		high(num1,num2,num3);
		
	}//end main
	public static void high(int num1,int num2,int num3)
	{
		int lowest =0;
		//largest number
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("The number " + num1 + " is the Highest number");
			lowest = low(num2,num3);
			System.out.println("The number " + lowest + " is the Lowest number");
			
		}//end if
		
		if(num2 > num1 && num2 > num3)
		{
			System.out.println("The number " + num2 + " is the Highest number");
			lowest = low(num1,num3);
			System.out.println("The number " + lowest + " is the Lowest number");
		}//end if
		
		if(num3 > num1 && num3> num2)
		{
			System.out.println("The number " + num3 + " is the Highest number");
			lowest = low(num1,num2);
			System.out.println("The number " + lowest + " is the Lowest number");
		}//end if
		//smallest number
	
	}//end highLow
	public static int low(int num1, int num2)
	{
		int lowest = 0;
		if(num1 < num2)
		{
			lowest = num1;
			
		}
		else if(num2 < num1)
		{
			lowest = num2;
		}
		return lowest;
	}//end low
	 
	
}//end class
