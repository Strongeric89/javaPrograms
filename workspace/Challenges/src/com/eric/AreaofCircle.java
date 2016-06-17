/*
 *The following program is to implement the Circle Calculator using 
 * Functions and then printing results to a .txt file
 */
package com.eric;
import java.util.Scanner;
import java.io.*;
import java.io.IOException;

public class AreaofCircle {
	public static void main(String [] args)throws IOException
	{
		Scanner scan = new Scanner(System.in);
		FileWriter fileout = new FileWriter("Circle.txt");
		PrintWriter text = new PrintWriter(fileout);
		
		text.println("Please enter the Radius of a Circle:");
		System.out.println("Please enter the Radius of a Circle:");
		float radius = scan.nextFloat();
		//PART1
		float cir = circumference(radius);
		
		text.printf("\nThe Circumference of the Circle is %.1f CM",cir);
		System.out.printf("\nThe Circumference of the Circle is %.1f CM",cir);
		
		//PART2
		float area1 = area(radius);
		text.printf("\nThe Area of the Circle is %.1f CM^sq\n",area1);
		text.println(" ");
		System.out.printf("\nThe Area of the Circle is %.1f CM^sq",area1);
		
		text.close();
	}//end main
	
	public static float circumference(float radius)
	{
		//assume circumference is 2pi r
		float pi = 3.14f;
		float cir = (2*pi) * radius;
		return cir;
	}//end circum
	
	public static float area(float radius)
	{
		//assume area is pi r SQ
		float pi = 3.14f;
		float area2 = pi *(radius * radius);
		return area2;
	}//end area
}//end class
