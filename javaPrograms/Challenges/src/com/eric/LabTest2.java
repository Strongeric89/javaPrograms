package com.eric;
import java.util.Scanner;


public class LabTest2 {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner (System.in);
		float gallons[] = new float [5];
		float miles [] = new float [5];
		float mpg[] = new float [5];
		String name = "Gallons";
		
		//gallons array
		gallons = popArray(gallons, name);
		name = "Miles";
		//miles array
		miles = popArray(miles, name);
		
		//final calculation for mpg array
		mpg = calculateMpg(gallons,miles);
		name = "Mpg";
		printArray(mpg,name);
		
	}//end main
	
	public static float[] popArray(float array[], String name)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Populate values into " + name + " Array");
		for(int i = 0;i<array.length;i++)
		{
			array[i] = scan.nextFloat();
			
		}//end for
		printArray(array,name);
		return array;
	}//end gallonsArray
	
	public static void printArray(float array[], String name)
	{
		System.out.println(name + " array\n--------------------------");
		for(int i = 0;i<array.length;i ++)
		{
			System.out.println((i + 1) +". "+ array[i]);
		}//end for
		
	}//end printArray
	
	public static float[] calculateMpg(float gallons[],float miles[])
	{
		float mpg[] = new float[5];
		//calculate elements for the mpg array
		for(int i = 0;i<gallons.length;i++)
		{
			mpg[i] = miles[i] / gallons[i];
		}//end for
		return mpg;
	}//end calculateMpg
}//end class
