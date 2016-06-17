package com.eric;
import java.util.Scanner;
import java.util.Random;

public class MatrixChallenge {
	public static void main(String [] args)
	{
		String numbers [] = {"1","0","1","0","1"};
		Scanner scan = new Scanner (System.in);
		Random r = new Random();
		int randNum = r.nextInt(5);
		boolean flag = true;
		int counter = 0;
		while(flag)
		{
			randNum = r.nextInt(5);
			System.out.print(numbers[randNum]);
			counter ++;
			
		}//end while


	}//end main
}//end class
