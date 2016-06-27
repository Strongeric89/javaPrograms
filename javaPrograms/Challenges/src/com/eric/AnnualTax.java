/*
 * the Following program is an annual tax calculator
 */
package com.eric;
import java.util.Scanner;
import java.text.DecimalFormat;

public class AnnualTax {
	public static void main(String [] args)
	{
		String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00"); // formats the value to a float and rounds
		System.out.println("Please enter your Annual Salary:");
		float salary = scan.nextFloat();
		System.out.println("Your Salary is �" + df.format(salary));
		System.out.println("Please enter your Tax Rate:");
		float tax = scan.nextFloat();
		System.out.println("Your Tax rate is " + tax + "%");
		float totalTax = (salary /100)* tax;
		System.out.println("Your total tax payable is �" + df.format(totalTax));
		System.out.println("After your tax, your take home is �" + df.format((salary - totalTax)));
		int j=0;
		float taxMnt = totalTax /12;
		System.out.println("\n--------------------------------------------\n");
		for(int i=1;i<=12;i++)
		{
			System.out.println("The tax for:" + months[j] + " = �" + df.format((taxMnt*i)));
			j++;
		}
		
		
		
	}//end main
}