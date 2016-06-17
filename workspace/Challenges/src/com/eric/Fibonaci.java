/*
 * the following program is implementation of Fibonaci Sequence
 */
package com.eric;
import java.util.Scanner;


public class Fibonaci {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Fibonaci Series.\n-------------------------------\nEnter the number of Sequences");
		int seq = scan.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2;
		
		System.out.print(" " + num1);
		System.out.print(", " + num2);
		for(int i=0;i<=seq;i++)
		{
			System.out.print(", "  + num3);
			num1 =num2;
			num2 = num3;
			num3 = num1 + num2;
			
		}//end for
		
	}//end main
}//end class
