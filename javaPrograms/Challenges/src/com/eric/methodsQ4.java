package com.eric;
import java.util.Scanner;

public class methodsQ4 {
	public static void main(String [] args)
	{
		System.out.println("Please enter 3 numbers:");
		Scanner scan = new Scanner (System.in);
		int num1,num2,num3;
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		float average = 0;
		int sum = 0;
		sum = sumOf(num1,num2,num3);
		System.out.printf(" %d\n",sum);
		average = avg(sum);
		System.out.print(average);
		
	
		
	}//end main
	public static int sumOf(int num1, int num2, int num3)
	{
		System.out.printf("The sum of %d + %d + %d is:",num1,num2,num3);
		int sum = num1 + num2 + num3;
		
		return sum;
	}//end sumOf
	public static float avg(int sum)
	{
		System.out.println("the average of sum is " + sum + " / 3 = ");
		float average = sum /3;
		return average;
	}

}
