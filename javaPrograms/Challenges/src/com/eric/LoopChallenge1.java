package com.eric;
import java.util.Scanner;

public class LoopChallenge1 {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 2 numbers:");
		System.out.print("number 1:");
		int num1 = scan.nextInt();
		System.out.print("number 2:");
		int num2 = scan.nextInt();
		int result = num1;
		
		//The loop to calculate the answer
		for(int i =0;i<num2;i++)
		{
			result= result * num1;
			System.out.println("Number:" + num1 + " | Iteration: " + (i + 1) + "| Sum:" + result);
			
			
		}//end for
		System.out.println("The final Answer is " + result);
		
	}//end main
}
