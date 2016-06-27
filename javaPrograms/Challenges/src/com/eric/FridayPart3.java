package com.eric;
import java.util.Scanner;
import java.util.Random;

public class FridayPart3 {
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int rand = r.nextInt(100);
		System.out.println("Please pick a random number between 0-99");
		int userGuess = 0;
		boolean isRunning = false;
		//System.out.println("Random Number: "+  rand);
		
		do{
			//userGuess = scan.nextInt();
			if(userGuess > rand)
			{
				
				isRunning = false;
				break;
			}//end if
			
			System.out.println("Please try again!");
			
			
		}//end do
		while(!isRunning);
		System.out.println("You guessed a number Higher than Random: " + rand);
	}//end main()
}
